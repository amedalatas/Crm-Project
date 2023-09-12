package com.crm.Springbootapplication.dto;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

@Getter
@Setter

@RequiredArgsConstructor
public class InfrastructureRequest {
    private String type;
    private String addressId;
/*
    public String getInfrastructureType() {
        return type;
    }*/

    public void setInfrastructureType(String infrastructureType) {
        this.type = infrastructureType;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

}