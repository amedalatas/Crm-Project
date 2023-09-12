package com.crm.Springbootapplication.controller;

import java.util.List;

import com.crm.Springbootapplication.dto.CustomerRequest;
import com.crm.Springbootapplication.dto.CustomerResponse;
import com.crm.Springbootapplication.dto.CustomerSaveRequest;
import com.crm.Springbootapplication.entity.Customer;
import com.crm.Springbootapplication.entity.Infrastructre;
import com.crm.Springbootapplication.service.CustomerServiceImpl;
import com.crm.Springbootapplication.service.InfrastructureServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "http://localhost:4200")

public class CustomerController {
    private final CustomerServiceImpl customerService;
    private final InfrastructureServiceImpl infrastructureService;

    @GetMapping("/getCustomers")
    public List<Customer> getCustomers() {

        return customerService.getCustomers();
    }


    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") String customerId){
        customerService.deleteCustomerById(customerId);
    }

    @PostMapping("/createCustomer")
    public CustomerResponse createCustomer(@RequestBody CustomerSaveRequest customer) {
        return customerService.createCustomer(customer);
    }

}



