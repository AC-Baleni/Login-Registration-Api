package com.balenii.registration.Login.RegistraionAPI.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/login")
    public String showLoginPAge(){
        return "redirect:/login.html";
    }

    @GetMapping("/signup")
    public String showSignUpPage(){
        return "redirect:/signup.html";
    }

}
