package com.archie.rabbitmq.processor;

import com.archie.rabbitmq.definition.QueueDefinition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class QueueProcessorTest {

    @InjectMocks
    private QueueProcessor queueProcessor;

    @Test
    public void shouldTestProcessorForNullExchange() {
        /**
         * TODO
         * Step 8.1
         * write a unit test to test QueueProcessor.process
         * case when exchange is null
         */

    }

    @Test
    public void shouldTestProcessorForNullMessage() {
        /**
         * TODO
         * Step 8.2
         * write a unit test to test QueueProcessor.process
         * case when message is null
         */

    }

    @Test
    public void shouldTestProcessorForNullOrEmptyBody() {
        /**
         * TODO
         * Step 8.3
         * write a unit test to test QueueProcessor.process
         * case when message body is null or empty
         */

    }

    @Test
    public void shouldTestProcessorForIncorrectHeaders() {
        /**
         * TODO
         * Step 8.4
         * write a unit test to test QueueProcessor.process
         * case when message headers are not proper
         */

    }

    @Test
    public void shouldTestProcessorForSuccessfulProcessing() {
        /**
         * TODO
         * Step 8.5
         * write a unit test to test QueueProcessor.process
         * case when every thing is proper
         */

    }
}