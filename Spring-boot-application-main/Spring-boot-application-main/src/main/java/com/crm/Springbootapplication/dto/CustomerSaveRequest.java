package com.crm.Springbootapplication.dto;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CustomerSaveRequest {

    private String tc;
    private String name;
    private String surname;
    private String mail;
    private String phone;
    private String birthday;//year.month.day
    private String userCode;
    private String campaignId;
    private String address;
    private String campaignName;


}