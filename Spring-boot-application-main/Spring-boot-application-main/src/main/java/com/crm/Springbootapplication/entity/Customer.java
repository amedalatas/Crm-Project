package com.crm.Springbootapplication.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Customer")
@Data
public class Customer {
    @Id
    private String ID;
    private String tc;
    private String name;
    private String surname;
    private String mail;
    private String phone;
    private String birthday;//year.month.day
    private String userCode;
    private String address;
    private boolean active;
    private String campaignName;

}