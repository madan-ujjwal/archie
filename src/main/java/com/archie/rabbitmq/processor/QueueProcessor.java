package com.archie.rabbitmq.processor;

import com.archie.model.bo.ArchieBo;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

public class QueueProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        /**
         * TODO
         * 1. extract body from exhange
         * 2. send the bo to archie service method processFromQueue for further processing
         */

        ArchieBo archieBo = getBoFromExchange(exchange);
//        archieService.processFromQueue(archieBo);

    }

    private ArchieBo getBoFromExchange(Exchange exchange) {
        /**
         * TODO
         * 1. extract headers from message and set MDC request id header
         * 2. extract body from message below and deserialize the object using jackson library
         */

        Message message = exchange.getIn();

        return new ArchieBo();
    }
}
