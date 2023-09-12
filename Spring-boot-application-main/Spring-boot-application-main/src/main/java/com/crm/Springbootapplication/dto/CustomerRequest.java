package com.crm.Springbootapplication.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CustomerRequest {
    private String name;
    private String surname;
    private String mail;
    private String phone;
    private String Address;
    private String BirthDate;

}
