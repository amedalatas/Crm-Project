package com.crm.Springbootapplication.repository;

import com.crm.Springbootapplication.entity.Customer;
import com.crm.Springbootapplication.entity.Infrastructre;
import com.crm.Springbootapplication.entity.Login;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends MongoRepository <Customer,String>{
    List<Customer> findByID(String id);

    List<Customer> findByName(String name);

    List<Customer> findByUserCode(String userCode);

    List<Customer> findByActiveFalse();


}
