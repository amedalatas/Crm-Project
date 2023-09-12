package com.crm.Springbootapplication.repository;

import com.crm.Springbootapplication.entity.Login;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoginRepository extends MongoRepository<Login,String> {



        Login findByPassword(String password);

        Login findByEmployeeMail(String mail);

        Login findLoginByEmployeeMail(String mail);



}
