package com.crm.Springbootapplication.controller;

import com.crm.Springbootapplication.entity.Campaign;
import com.crm.Springbootapplication.entity.Customer;
import com.crm.Springbootapplication.service.CampaignServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/campaign")
@CrossOrigin(origins = "*")

public class CampaignController {
    private final CampaignServiceImpl campaignService;
/*
    @GetMapping("/getCampaigns")
    public List<Campaign> getCampaigns() {

        return campaignService.getCampaign();
    }*/
    @GetMapping("/getAllCampaigns")
    public ResponseEntity<List<Campaign>> getAllCampaigns() {
        List<Campaign> campaigns = campaignService.getCampaign();
        return ResponseEntity.ok(campaigns);
    }
    @GetMapping("/byInfrastructure/{infrastructure}")
    public ResponseEntity<List<Campaign>> getCampaignsByInfrastructure(@PathVariable String infrastructure) {
        List<Campaign> campaigns = campaignService.getCampaignsByInfrastructure(infrastructure);
        return ResponseEntity.ok(campaigns);
    }
}
