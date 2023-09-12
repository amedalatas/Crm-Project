package com.crm.Springbootapplication.entity;

import com.crm.Springbootapplication.dto.PropertiesRequest;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

@Document(collection = "Campaign")
@Data
public class Campaign {
    @Id
    private String ID;
    private String title;
    private String infrastructure;
    private String mbps;
    private String commitment;
    private List<Prop>properties;
    private Set<PropertiesRequest> campaignProperties;
    private String description;



}