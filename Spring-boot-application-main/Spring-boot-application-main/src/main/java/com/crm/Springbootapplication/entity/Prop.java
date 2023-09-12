package com.crm.Springbootapplication.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Data
public class Prop {
    @Id
    private String commitment;
    private String price;

}