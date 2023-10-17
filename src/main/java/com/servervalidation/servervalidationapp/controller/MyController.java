package com.servervalidation.servervalidationapp.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.servervalidation.servervalidationapp.entities.LoginData;

@Controller
public class MyController {

    @GetMapping("/form")
    public String openForm(Model m){
        LoginData loginData = new LoginData();
        m.addAttribute("loginData",loginData);
        return "form";
    }

    //handeller for processing form
    @PostMapping("/form-submit")
    public String processForm(@Valid @ModelAttribute("loginData") LoginData lData , BindingResult result){

        if(result.hasErrors()){
            System.out.println(result);
            return "form";
        }
        System.out.println(lData);
        return "success";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    
    
}
