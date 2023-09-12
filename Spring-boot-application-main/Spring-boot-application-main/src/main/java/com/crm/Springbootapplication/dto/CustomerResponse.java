package com.crm.Springbootapplication.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerResponse {

    private String name;
    private String surname;
    private String tc;
    private String mail;
    private String phone;
    private String birthday;
    private String address;
    private String campaignName;

}