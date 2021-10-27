package com.archie.rabbitmq.definition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class QueueDefinitionTest {

    @InjectMocks
    private QueueDefinition queueDefinition;

    @Test
    public void shouldGetQueueUrl() {
        /**
         * TODO
         * write a unit test to test QueueDefinition.getQueueUrl
         */

        String expectedUrl = "change this to the correct url";

        String actualUrl = queueDefinition.getQueueUrl();
        Assertions.assertEquals(expectedUrl, actualUrl);
    }
}