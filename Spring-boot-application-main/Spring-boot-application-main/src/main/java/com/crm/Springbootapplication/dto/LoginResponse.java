package com.crm.Springbootapplication.dto;

import com.crm.Springbootapplication.entity.Login;
import lombok.Data;

@Data
public class LoginResponse {
    private boolean success;
    private String message;
    private Login login;

    public LoginResponse() {
    }

    public LoginResponse(boolean success, String message, Login login) {
        this.success = success;
        this.message = message;
        this.login = login;
    }


}

