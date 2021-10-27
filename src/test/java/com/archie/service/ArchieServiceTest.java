package com.archie.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ArchieServiceTest {

    @InjectMocks
    private ArchieService archieService;

    @Test
    public void shouldProcessFromQueueSuccessfully() {
        /**
         * TODO
         * Step 2.1
         * write a unit test to test ArchieService.processFromPostCall
         * in case of successful response
         */
    }

    @Test
    public void shouldHandleErrorInPersistInMongo() {
        /**
         * TODO
         * Step 4.1
         * write a unit test to test ArchieService.persistInMongo
         * in case of error while persisting
         */
    }

    @Test
    public void shouldSuccessfullyPersistInMongo() {
        /**
         * TODO
         * Step 4.2
         * write a unit test to test ArchieService.persistInMongo
         * in case of successful persistence
         */
    }

    @Test
    public void shouldHandleErrorInPushToQueue() {
        /**
         * TODO
         * Step 6.1
         * write a unit test to test ArchieService.pushToQueue
         * in case of error while pushing to rmq
         */
    }

    @Test
    public void shouldSuccessfullyPushToQueue() {
        /**
         * TODO
         * Step 6.2
         * write a unit test to test ArchieService.pushToQueue
         * in case of successful pushing to rmq
         */

    }
    @Test
    public void shouldSuccessfullyGetBodyFromBo() {
        /**
         * TODO
         * Step 5.1
         * write a unit test to test ArchieService.getBodyFromBo
         * in case of successful serializing BO
         */
    }

    @Test
    public void shouldHandleErrorInProcessFromQueue() {
        /**
         * TODO
         * Step 10.1
         * write a unit test to test ArchieService.processFromQueue
         * in case of error while processing from rmq
         */
    }

    @Test
    public void shouldSuccessfullyProcessFromQueue() {
        /**
         * TODO
         * Step 10.2
         * write a unit test to test ArchieService.processFromQueue
         * in case of successful processing from rmq
         */
    }

    @Test
    public void shouldHandleErrorInGetFromMongoForId() {
        /**
         * TODO
         * Step 12.1
         * write a unit test to test ArchieService.getFromMongoForId
         * in case of error while getting from mongo
         */
    }

    @Test
    public void shouldGiveExceptionIfEntityNotPresentInGetFromMongoForId() {
        /**
         * TODO
         * Step 12.2
         * write a unit test to test ArchieService.getFromMongoForId
         * should throw error id entity is not present for the id
         */
    }

    @Test
    public void shouldSuccessfullyGetFromMongoForId() {
        /**
         * TODO
         * Step 12.3
         * write a unit test to test ArchieService.getFromMongoForId
         * in case of successfully getting from mongo
         */
    }


}