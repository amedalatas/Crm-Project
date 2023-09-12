package com.crm.Springbootapplication.repository;

import com.crm.Springbootapplication.entity.Campaign;
import com.crm.Springbootapplication.entity.Infrastructre;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampaignRepository extends MongoRepository<Campaign,String> {
    String findTypeByInfrastructure(String infrastructure);
    List<Campaign> findByTitle(String title);

    List<Campaign> findByInfrastructure(String infrastructure);
}
