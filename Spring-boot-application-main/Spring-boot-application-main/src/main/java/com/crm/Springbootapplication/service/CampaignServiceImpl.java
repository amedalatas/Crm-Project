package com.crm.Springbootapplication.service;

import com.crm.Springbootapplication.entity.Campaign;
import com.crm.Springbootapplication.repository.CampaignRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class    CampaignServiceImpl {
    private final CampaignRepository campaignRepository;

    public List<Campaign> getCampaign(){
        return campaignRepository.findAll();
    }

    public List<Campaign> getCampaignsByInfrastructure(String infrastructure) {
        return campaignRepository.findByInfrastructure(infrastructure);
    }

}
