package com.archie.service;

import com.archie.model.bo.ArchieBo;
import com.archie.model.dao.MongoEntity;
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
         * Step 2
         * 1. convert request object to bo
         * 2. make a get call to agify using agify http client
         * 3. convert bo to mongo entity
         * 4. persist the data in mongo using persistInMongo method
         * 5. push the bo to the queue using pushToQueue method
         * 6. convert the bo to response object and return in this method
         */

        return new ArchieResponse();
    }

    public void persistInMongo(MongoEntity mongoEntity) {

        /**
         * TODO
         * Step 3
         * 1. auto wire archie mongo repository
         * 2. use that to save the mongo entity
         */
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