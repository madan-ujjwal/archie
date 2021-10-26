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
         * pass the request to the service method processFromPostCall
         * fetch the archie response and pass it in response
         */


        ArchieResponse archieResponse = new ArchieResponse();
//        archieResponse = archieService.processFromPostCall(request);
        ResponseWrapper<ArchieResponse> wrapper = new ResponseWrapper<>(archieResponse, null);
        return new ResponseEntity<>(wrapper, HttpStatus.OK);
    }

    @RequestMapping(path = "/mongo/{archieId}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<ResponseWrapper<ArchieResponse>> getFromMongoForId(@PathVariable("archieId") Long archieId) {

        /**
         * TODO
         * pass the request to the service method processFromPostCall
         * fetch the archie response and pass it in response
         */

        ArchieResponse archieResponse = new ArchieResponse();
//        archieResponse = archieService.getFromMongoForId(archieId);
        ResponseWrapper<ArchieResponse> wrapper = new ResponseWrapper<>(archieResponse, null);
        return new ResponseEntity<>(wrapper, HttpStatus.OK);
    }

    /**
     * TODO
     * write a GET api to fetch the archie response from mysql for a provided ip
     */

}
