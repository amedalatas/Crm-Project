package com.crm.Springbootapplication.controller;

import com.crm.Springbootapplication.dto.SetupResponse;
import com.crm.Springbootapplication.entity.Customer;
import com.crm.Springbootapplication.entity.Setup;
import com.crm.Springbootapplication.entity.SetupInfo;
import com.crm.Springbootapplication.repository.SetupRepository;
import com.crm.Springbootapplication.service.CustomerServiceImpl;
import com.crm.Springbootapplication.service.SetupServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/setup")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")

public class SetupController {
    private final SetupServiceImpl setupService;
    private final SetupRepository setupRepository   ;
    private final CustomerServiceImpl customerService;

    @GetMapping("/getSetup")
    public List<Setup> getSetuppers(){

        return setupService.getSetup();
    }


    @GetMapping("/getInActiveCustomers")
    public List<Customer> getCustomers(@RequestParam(value = "active", defaultValue = "false" ) boolean activeOnly) {
        return customerService.getAllCustomers(activeOnly);
    }

    @GetMapping("/getSetupper")
    public ResponseEntity<SetupResponse> getSetup() {
        List<Customer> inactiveCustomers = customerService.getInactiveCustomers();
        List<Setup> allEmployees = setupService.getAllEmployees();

        SetupResponse setupResponse = new SetupResponse();
        setupResponse.setInactiveCustomers(inactiveCustomers);
        setupResponse.setAllEmployees(allEmployees);

        return ResponseEntity.ok(setupResponse);
    }

    @GetMapping("/api/setup-info")
    public List<SetupInfo> getAllSetupInfo(){
        List<Setup> setups = setupRepository.findAll();
        List<SetupInfo> allSetupInfo = new ArrayList<>();

        for(Setup setup : setups){
            allSetupInfo.addAll(setup.getSetupInfoList());
        }
        return allSetupInfo;

    }
}
