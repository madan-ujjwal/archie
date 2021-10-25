package com.archie.rabbitmq.processor;

import com.archie.model.bo.ArchieBo;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class QueueProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        ArchieBo archieBo = getBoFromExchange(exchange);

        /**
         * TODO send this bo to archie service method processFromQueue for processing
         */
//        archieService.processFromQueue(archieBo);

    }

    private ArchieBo getBoFromExchange(Exchange exchange) {
        /**
         * TODO fill up archie bo from exchange
         */

        return new ArchieBo();
    }
}
