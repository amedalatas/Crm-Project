package com.crm.Springbootapplication.dto;

import com.crm.Springbootapplication.entity.Campaign;
import lombok.Data;

import java.util.List;

@Data
public class CampaignRequest {
    private String title;
    private String infrastructure;
    private String mbps;
    private List<PropertiesRequest> properties;
}