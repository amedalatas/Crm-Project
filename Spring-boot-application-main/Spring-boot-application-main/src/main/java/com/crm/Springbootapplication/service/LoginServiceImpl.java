package com.crm.Springbootapplication.service;

import com.crm.Springbootapplication.entity.Login;
import com.crm.Springbootapplication.repository.LoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl {
    private final LoginRepository loginRepository;

    public boolean authenticate(String email, String password) {
        Login existingEmployee = loginRepository.findLoginByEmployeeMail(email);
        if (existingEmployee != null && existingEmployee.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
    public Login findLoginByEmployeeMail(String email) {
        return loginRepository.findByEmployeeMail(email);
    }
    public Login createaLogin(Login login){
        return loginRepository.save(login);
    }
}
