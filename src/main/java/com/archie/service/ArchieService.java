package com.archie.service;

import com.archie.model.bo.ArchieBo;
import com.archie.model.dto.ArchieRequest;
import com.archie.model.dto.ArchieResponse;

public class ArchieService {

    public void processFromQueue(ArchieBo archieBo) {

    }

    public ArchieResponse processFromPostCall(ArchieRequest archieRequest) {

        return new ArchieResponse();
    }

    public ArchieResponse getFromMongoForId(long archieId) {

        return new ArchieResponse();
    }
}