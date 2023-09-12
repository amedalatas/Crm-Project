package com.crm.Springbootapplication.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.crm.Springbootapplication.entity.SetupInfo;
import java.util.List;
@Document(collection = "Setup")
@Data
public class Setup {
    @Id
    private String id;
     private String setup_status;
     private String employee_name;
     private String employee_surname;
     private String employee_explanation;
    private List<SetupInfo>setupInfoList;
     private  List<Customer> customers;


}
