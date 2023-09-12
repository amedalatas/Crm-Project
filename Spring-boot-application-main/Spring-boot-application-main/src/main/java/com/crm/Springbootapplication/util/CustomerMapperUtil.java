package com.crm.Springbootapplication.util;

import com.crm.Springbootapplication.dto.CustomerRequest;
import com.crm.Springbootapplication.dto.CustomerResponse;
import com.crm.Springbootapplication.dto.CustomerSaveRequest;
import com.crm.Springbootapplication.entity.Customer;

public class CustomerMapperUtil {

    public static Customer toCustomer (CustomerSaveRequest customerSaveRequest){
        Customer customer = new Customer();

        customer.setTc(customerSaveRequest.getTc());
        customer.setName(customerSaveRequest.getName());
        customer.setSurname(customerSaveRequest.getSurname());
        customer.setMail(customerSaveRequest.getMail());
        customer.setPhone(customerSaveRequest.getPhone());
        customer.setBirthday(customerSaveRequest.getBirthday());
        //customer.setCampaignId(customerSaveRequest.getCampaign.getID());
        customer.setAddress(customerSaveRequest.getAddress());
        customer.setActive(false);
        customer.setCampaignName(customerSaveRequest.getCampaignName());

        return customer;
    }

    public static CustomerResponse toCustomerResponse(Customer customer){

        CustomerResponse customerResponse = new CustomerResponse();

        customerResponse.setName(customer.getName());
        customerResponse.setSurname(customer.getSurname());
        customerResponse.setTc(customer.getTc());
        customerResponse.setMail(customer.getMail());
        customerResponse.setPhone(customer.getPhone());
        customerResponse.setBirthday(customer.getBirthday());
        //customerResponse.setCampaignId(String.valueOf(customer.getCampaignId()));
        customerResponse.setAddress(customer.getAddress());
        customerResponse.setCampaignName(customer.getCampaignName());

        return customerResponse;
    }


}