package com.archie;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.ProducerTemplate;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.web.client.RestTemplate;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.containers.RabbitMQContainer;
import org.testcontainers.utility.DockerImageName;

import java.text.MessageFormat;

@SpringBootTest(classes = {ArchieRunner.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@Slf4j
public class AbstractIntegrationTest {

    @LocalServerPort
    protected int port;

    protected RestTemplate restTemplateNew = new RestTemplate();

    @Autowired
    protected ProducerTemplate producerTemplate;

    /**
     * commenting code which starts container
     */
    public static RabbitMQContainer rabbitMQContainer;
    public static MongoDBContainer mongoDBContainer;
    private static boolean initialized = false;

    @BeforeAll
    public static void setUpContainers() {
        if (!initialized) {
            log.info("initializing rabbit mq test container");
            rabbitMQContainer = new RabbitMQContainer("rabbitmq:3-management");
            rabbitMQContainer.start();
            log.info("initialized rabbit mq test container successfully");

            log.info("initializing mongo test container");
            mongoDBContainer = new MongoDBContainer(DockerImageName.parse("mongo:4.0.10"));
            mongoDBContainer.start();
            log.info("initialized mongo test container successfully");

            initialized = true;
        }
    }

    @DynamicPropertySource
    public static void overrideProps(DynamicPropertyRegistry registry) {
        overrideRMQProps(registry);
    }

    private static void overrideRMQProps(DynamicPropertyRegistry registry) {
        String rmqIPAddress = rabbitMQContainer.getContainerIpAddress();
        long rmqPort = rabbitMQContainer.getMappedPort(5672);
        String rmqUrl = MessageFormat.format("rabbitmq://{0}:{1}", rmqIPAddress, String.valueOf(rmqPort));

        registry.add("rmq.url", () -> rmqUrl);
        registry.add("rmq.user", rabbitMQContainer::getAdminUsername);
        registry.add("rmq.password", rabbitMQContainer::getAdminPassword);
    }
}
