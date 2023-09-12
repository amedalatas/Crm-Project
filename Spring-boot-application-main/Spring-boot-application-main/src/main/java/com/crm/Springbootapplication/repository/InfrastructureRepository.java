package com.crm.Springbootapplication.repository;

import com.crm.Springbootapplication.entity.Infrastructre;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfrastructureRepository extends MongoRepository <Infrastructre,String> {

    //String findByAddressContainingIgnoreCase(String address);

    List<Infrastructre> findByAddress(String address);
    //public boolean findByAddressIsTrue(String address);
}
