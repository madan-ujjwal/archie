package com.archie.repository.mongo;

import com.archie.model.dao.MongoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArchieMongoRepository extends MongoRepository<MongoEntity, String> {

}
