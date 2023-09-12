package com.crm.Springbootapplication.service;

import com.crm.Springbootapplication.entity.Infrastructre;
import com.crm.Springbootapplication.repository.InfrastructureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InfrastructureServiceImpl {

    private final InfrastructureRepository infrastructureRepository;
/*
    public static String getByAddress(String address) {
        String byAddress = com.crm.Springbootapplication.repository.InfrastructureRepository.findByAddress(address);
        return byAddress;

    }*/

    /*public List<Infrastructre> getInfrastructure() {

        return infrastructureRepository.findAll();
    }*/

    public Infrastructre createInfrastructure(Infrastructre infrastructre){
        return infrastructureRepository.save(infrastructre);

    }
    public void deleteInfrastructure(String infrastructureId){
        infrastructureRepository.deleteById(infrastructureId);

    }
    public List<Infrastructre> getTypeByAddress(String address) {

        return infrastructureRepository.findByAddress(address);


    }


}
