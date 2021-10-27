package com.archie.controllers;

import com.archie.model.dto.ArchieRequest;
import com.archie.model.dto.ArchieResponse;
import com.archie.model.dto.ResponseWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/archie/v1")
public class ArchieController {

    @RequestMapping(path = "/postCall", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<ResponseWrapper<ArchieResponse>> postCall(@RequestBody ArchieRequest request) {

        /**
         * TODO
         * Step 1
         * 1. pass the request to the service method processFromPostCall
         * 2. accept the archie response from the service layer and return in the api
         */


        ArchieResponse archieResponse = new ArchieResponse();
//        archieResponse = archieService.processFromPostCall(request);
        ResponseWrapper<ArchieResponse> wrapper = new ResponseWrapper<>(archieResponse, null);
        return new ResponseEntity<>(wrapper, HttpStatus.OK);
    }

    @RequestMapping(path = "/mongo/{archieId}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<ResponseWrapper<ArchieResponse>> getFromMongoForId(@PathVariable("archieId") String archieId) {

        /**
         * TODO
         * Step 11
         * 1. pass the requested id to the service method processFromPostCall
         * 2. accept the archie response from the service layer and return in the api
         */

        ArchieResponse archieResponse = new ArchieResponse();
//        archieResponse = archieService.getFromMongoForId(archieId);
        ResponseWrapper<ArchieResponse> wrapper = new ResponseWrapper<>(archieResponse, null);
        return new ResponseEntity<>(wrapper, HttpStatus.OK);
    }

    /**
     * TODO
     * Step 13
     * write a GET api to fetch the archie response from mysql for a provided archie id in the request
     * similar to the GET call above, but here you will be fetching the entity from mysql
     */

}
