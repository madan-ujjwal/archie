package com.archie.rabbitmq.producer;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class QueueProducer {

    @Autowired
    private ProducerTemplate producerTemplate;

    private void pushToQueue(String body, Map<String, Object> headers) throws Exception {

        /**
         * TODO
         * Step 7
         * Auto wire QueueDefinition class and fetch the url for the queue
         * using producerTemplate push to the queue
         */

    }
}
