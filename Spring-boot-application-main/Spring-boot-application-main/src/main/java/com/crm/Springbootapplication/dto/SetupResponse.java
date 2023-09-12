package com.crm.Springbootapplication.dto;

import com.crm.Springbootapplication.entity.Customer;
import com.crm.Springbootapplication.entity.Setup;
import lombok.Data;

import java.util.List;

@Data
public class SetupResponse {
    private List<Customer> inactiveCustomers;
    private List<Setup> allEmployees;

}
