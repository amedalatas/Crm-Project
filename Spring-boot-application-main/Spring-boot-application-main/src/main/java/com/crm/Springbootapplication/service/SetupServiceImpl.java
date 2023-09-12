package com.crm.Springbootapplication.service;

import com.crm.Springbootapplication.entity.*;
import com.crm.Springbootapplication.repository.CampaignRepository;
import com.crm.Springbootapplication.repository.CustomerRepository;
import com.crm.Springbootapplication.repository.SetupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SetupServiceImpl {
    private final SetupRepository setupRepository;


    private final CustomerServiceImpl customerService;
    public List<Setup>getCustomerInActive() {
        Setup setup = new Setup();

        List<Customer> customers = customerService.getCustomers();

        List<Customer> inactiveCustomers = customers.stream()
                .filter(customer -> !customer.isActive())
                .collect(Collectors.toList());

        setup.setCustomers(inactiveCustomers);


        return (List<Setup>) setup;
    }



    public List<Setup> getSetup()
    {
        return setupRepository.findAll();
    }
    public List<Setup> getAllEmployees() {
        return setupRepository.findAll();
    }

}
