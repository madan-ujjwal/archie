package com.archie.controllers;

import com.archie.service.ArchieService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ArchieControllerTest {

    @InjectMocks
    private ArchieController archieController;

    @Test
    public void shouldGetExceptionIfErrorFromServiceLayerInPostCall() {
        /**
         * TODO
         * Step 1.1
         * write a unit test to test ArchieController.postCall
         * in case of error from service layer
         */
    }

    @Test
    public void shouldGetSuccessfulResponseFromPostCall() {
        /**
         * TODO
         * Step 1.2
         * write a unit test to test ArchieController.postCall
         * in case of successful response
         */
    }

    @Test
    public void shouldGetExceptionIfErrorFromServiceLayerInGetFromMongoForId() {
        /**
         * TODO
         * Step 11.1
         * write a unit test to test ArchieController.getFromMongoForId
         * in case of error from service layer
         */
    }

    @Test
    public void shouldGet400IfNoEntityExistsForProvidedIdInGetFromMongoForId() {
        /**
         * TODO
         * Step 11.2
         * write a unit test to test ArchieController.getFromMongoForId
         * in case of no entity present for the id
         */
    }

    @Test
    public void shouldGetSuccessfulResponseFromGetFromMongoForId() {
        /**
         * TODO
         * Step 11.3
         * write a unit test to test ArchieController.getFromMongoForId
         * in case of successful response
         */
    }

    /**
     * TODO
     * Step 13.1
     * write a unit tests to test ArchieController.getFromMysqlForId
     * in case of successful response
     */

//    public void shouldGetExceptionIfErrorFromServiceLayerInGetFromMysqlForId() {
//
//    }
//
//    public void shouldGet400IfNoEntityExistsForProvidedIdInGetFromMysqlForId() {
//
//    }
//
//    public void shouldGetSuccessfulResponseFromGetFromMysqlForId() {
//
//    }

}