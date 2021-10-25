package com.archie.service;

import com.archie.model.bo.ArchieBo;
import com.archie.model.dto.ArchieRequest;
import com.archie.model.dto.ArchieResponse;
import com.archie.rabbitmq.producer.QueueProducer;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Slf4j
public class ArchieService {

    public ArchieResponse processFromPostCall(ArchieRequest archieRequest) {

        QueueProducer queueProducer;

        /**
         * TODO
         * 1. convert request object to bo
         * 2. make a get call at `https://api.agify.io?name=<name>`
         * this api gives an expected age from a given name,
         * make the request to this api using the name from request and get the expected age, populate that in the bo
         * 3. persist the data in mongo
         * 4. push the bo to the queue using pushToQueue method
         * 5. convert the bo to response object and return in this method
         */

        return new ArchieResponse();
    }

    public void pushToQueue(ArchieBo archieBo) {
        String queueBody = getBodyFromBo(archieBo);
        Map<String, Object> queueHeaders = new HashMap<>();
        queueHeaders.put("req_id", UUID.randomUUID().toString());
//        queueProducer.pushToQueue(queueBody, queueHeaders);
    }

    private String getBodyFromBo(ArchieBo archieBo) {
        /**
         * TODO
         * 1. serialize the archie bo object to a json
         * 2. log the json created
         * 3. return that json string
         */
        return null;
    }

    public void processFromQueue(ArchieBo archieBo) {
        /**
         * TODO
         * 1. convert bo to mysql entity
         * 2. persist the mysql entity in mysql db
         */
    }

    public ArchieResponse getFromMongoForId(long archieId) {

        /**
         * TODO
         * 1. using the archieId get the mysql entity
         * 2. convert to response object and return
         */
        return new ArchieResponse();
    }
}