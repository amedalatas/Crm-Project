package com.crm.Springbootapplication.controller;

import com.crm.Springbootapplication.entity.Infrastructre;
import com.crm.Springbootapplication.service.InfrastructureServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/infrastructure")
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class InfrastructureController {

    private final InfrastructureServiceImpl infrastructureService;

    /*@GetMapping("/getInfrastructures")
    public List<Infrastructre> getInfrastructures(){

        return infrastructureService.getInfrastructure();
    }*/

   /* @GetMapping("/getInfrastructureByAddress")
    public String getInfrastructures(@RequestParam String address){

        return infrastructureService.getInfrastructureByAddress(address);
    }*/
   @GetMapping("/getInfrastructures")
   public List<Infrastructre> getInfrastructureType (@RequestParam String address){
       return infrastructureService.getTypeByAddress(address);
   }

    @PostMapping("/createInfrastructure")
    public Infrastructre createInfrastructure(@RequestBody Infrastructre infrastructre){
        return infrastructureService.createInfrastructure(infrastructre);
    }
    @DeleteMapping("/deleteInfrastructure{id}")
    public void deleteInfrastructure(@PathVariable("id") String infrastructureId ){
        infrastructureService.deleteInfrastructure(infrastructureId);
    }

    /*
    @GetMapping(value = "/getByAddress/{address}")
    public String getByAddress(@PathVariable String address) {
        return InfrastructureServiceImpl.getByAddress(address);
    }*/
}
