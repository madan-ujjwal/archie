package com.archie.rabbitmq.processor;

import com.archie.service.ArchieService;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class QueueProcessorTest {

    @InjectMocks
    private QueueProcessor queueProcessor;

    @Mock
    private ArchieService archieService;

    @Mock
    private Exchange exchange;

    private Message message;

    private String body;

    private Map<String, Object> headers;

    // what does this mean
    @BeforeEach
    public void setUp() {

        // why am i doing this ?
        message = Mockito.mock(Message.class);
        message.setBody(body);
        exchange.setMessage(message);
    }

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
    public void shouldTestProcessorForSuccessfulProcessing() throws Exception {
        /**
         * TODO
         * Step 8.5
         * write a unit test to test QueueProcessor.process
         * complete this case
         */

        body = "set a correct body here";
        headers = new HashMap<>();

        // what does this do ?
        when(exchange.getIn()).thenReturn(message);
        // what does this do ?
        when(message.getBody(String.class)).thenReturn(body);
        // what does this do ?
        when(message.getHeaders()).thenReturn(headers);

        queueProcessor.process(exchange);

        // what does this do ?
        verify(archieService, times(1)).processFromQueue(any());

    }
}