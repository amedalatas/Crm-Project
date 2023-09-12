package com.crm.Springbootapplication.repository;

import com.crm.Springbootapplication.entity.Setup;
import com.mongodb.client.MongoCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SetupRepository extends MongoRepository<Setup,String> {
}
