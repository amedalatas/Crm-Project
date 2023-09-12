package com.crm.Springbootapplication.service;

import com.crm.Springbootapplication.dto.CustomerResponse;
import com.crm.Springbootapplication.dto.CustomerSaveRequest;
import com.crm.Springbootapplication.entity.Customer;
import com.crm.Springbootapplication.entity.Login;
import com.crm.Springbootapplication.repository.CustomerRepository;
import com.crm.Springbootapplication.repository.InfrastructureRepository;
import com.crm.Springbootapplication.repository.LoginRepository;
import com.crm.Springbootapplication.util.CustomerMapperUtil;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl {

    private final CustomerRepository customerRepository;
    private final InfrastructureRepository infrastructureRepository;
    private final InfrastructureServiceImpl infrastructureService;
    private final LoginRepository loginRepository;
    public List<Customer> getCustomers() {

        return customerRepository.findAll();
    }
    @Service
    public class CustomerService {

    }

    public List<Customer> getAllCustomers(boolean isActiveOnly) {
        List<Customer> customers = getCustomers();

        customers = customers.stream()
                    .filter(customer -> !customer.isActive())
                    .collect(Collectors.toList());

        return customers;
    }
    public CustomerResponse createCustomer(CustomerSaveRequest request){
        Customer customer = CustomerMapperUtil.toCustomer(request);
        Customer createdCustomer = customerRepository.save(customer);
        return CustomerMapperUtil.toCustomerResponse(createdCustomer);
    }

    public void deleteCustomerById(String customerId){

        customerRepository.deleteById(customerId);
    }

    public List<Customer> listCustomerByID(String ID){

        List<Customer> customers = customerRepository.findByID(ID);

        return customers;
    }

    public List<Customer> listCustomerByName(String name){

        List<Customer> customersByName = customerRepository.findByName(name);

        return customersByName;
    }

    public List<Customer> listCustomerByUserCode (String userCode){

        List<Customer> customerByUserCode = customerRepository.findByUserCode(userCode);

        return customerByUserCode;
    }

    public List<Customer> getInactiveCustomers() {
        return customerRepository.findByActiveFalse();
    }

}
