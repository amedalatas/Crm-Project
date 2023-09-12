package com.crm.Springbootapplication.entity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Login")
@Data
public class Login {
    @Id
    private String employee_id;
    private String employee_name;
    private String employee_surname;
    private String employee_phone;
    private String password;
    private String employeeMail;
    private Customer customer;

}