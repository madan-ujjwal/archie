package com.archie;

import com.archie.model.dto.ArchieResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {"com.archie"})
@EnableAutoConfiguration
public class ArchieRunner {

    public static void main(String[] args) {
        log.info("Starting ARCHIE");
        SpringApplication.run(ArchieResponse.class, args);
        log.info("ARCHIE is up");
    }
}
