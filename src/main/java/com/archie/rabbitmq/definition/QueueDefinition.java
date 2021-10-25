package com.archie.rabbitmq.definition;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class QueueDefinition {

    @Value("${rmq.url}")
    protected String RMQ_URL;

    @Value("${rmq.user}")
    protected String RMQ_USER;

    @Value("${rmq.password}")
    protected String RMQ_PASS;

    @Value("${rmq.queue.name}")
    private String QUEUE_NAME;

    @Value("${rmq.exchange.type}")
    private String EXCHANGE_TYPE;

    @Value("${rmq.consumer.count}")
    private Long CONSUMER_COUNT;

    @Value("${rmq.prefetch.count}")
    private Long PREFETCH_COUNT;

    public String getQueueUrl() {

        /**
         * TODO
         * create the queue url and return
         */
        String queueUrl = "";
        log.info("queue url : {}", queueUrl);
        return queueUrl;
    }

}
