package com.stackroute.jwtauthentication.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class DashBoard {
    @GetMapping({ "/welcome" })
    public String firstPage() {
        return "Welcome";
    }

}
