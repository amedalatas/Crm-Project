package com.crm.Springbootapplication.controller;

import com.crm.Springbootapplication.dto.LoginRequest;

import com.crm.Springbootapplication.dto.LoginResponse;
import com.crm.Springbootapplication.entity.Login;
import com.crm.Springbootapplication.service.LoginServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("login")
@CrossOrigin(origins = "*")
public class LoginController {
    private final LoginServiceImpl loginService;


    @PostMapping("/loginControl")
    public ResponseEntity<LoginResponse> loginEmployee(@RequestBody LoginRequest loginRequest) {
        String email = loginRequest.getEmployee_mail();
        String password = loginRequest.getPassword();

        if (loginService.authenticate(email, password)) {
            Login login = loginService.findLoginByEmployeeMail(email);
            if (login != null) {
                LoginResponse response = new LoginResponse();
                response.setMessage("Kullanıcı girişi başarılı.");
                response.setSuccess(true);
                response.setLogin(login);
                return ResponseEntity.ok(response);
            }
        }

        LoginResponse response = new LoginResponse();
        response.setMessage("Hatali bilgi girisi.");
        response.setSuccess(false);
        return ResponseEntity.ok(response);
    }
//    ResponseEntity<Map<String, Object>> loginEmployee(@RequestBody LoginRequest loginRequest) {
//        String email = loginRequest.getEmployee_mail();
//        String password = loginRequest.getPassword();
//
//        Map<String, Object> responseSuccses = new HashMap<>();
//        Map<String, Object> responseUnSuccses = new HashMap<>();
//        responseSuccses.put("message", "Kullanıcı girişi başarılı.");
//        if (loginService.authenticate(email, password)) {
//            // Başarılı giriş durumunda
//            return  ResponseEntity.ok(responseSuccses);
//        } else {
//            // Hatalı giriş durumunda
//            responseUnSuccses.put("message", "Hatali bilgi girisi.");
//            return ResponseEntity.ok(responseUnSuccses);
//        }
//    }



    @PostMapping("/createLogin")
    public Login createLogin(@RequestBody Login login){
        return loginService.createaLogin(login);
    }
}


