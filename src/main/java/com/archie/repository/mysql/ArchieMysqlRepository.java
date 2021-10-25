package com.archie.repository.mysql;

import com.archie.model.dao.MysqlEntity;
import org.springframework.data.repository.CrudRepository;

public interface ArchieMysqlRepository extends CrudRepository<MysqlEntity,Long> {

}