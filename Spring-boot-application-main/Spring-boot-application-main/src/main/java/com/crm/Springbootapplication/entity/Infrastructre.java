package com.crm.Springbootapplication.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "Infrastructure")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Infrastructre {

    @Id
    private String ID;
    private String type;
    private String address;


}