package com.assigment.forgotPassword.controller;

import com.assigment.forgotPassword.service.ForgotPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForgotasswordController {
    @Autowired
    private ForgotPasswordService service;

    @PostMapping("/forgot-password")
    public String forgotPass(@RequestParam String email){
        String response = service.forgotPass(email);

        if(!response.startsWith("Invalid")){
            response= "http://localhost:8080/reset-password?token=" + response;
        }
        return response;
    }

    @PutMapping("/reset-password")
        public String resetPass(@RequestParam String token, @RequestParam String password){
            return service.resetPass(token,password);
        }

}
