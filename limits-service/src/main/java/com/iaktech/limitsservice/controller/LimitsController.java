package com.iaktech.limitsservice.controller;

import com.iaktech.limitsservice.configuration.Configuration;
import com.iaktech.limitsservice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public Limits retrieveLimits(){
   // return new Limits(1,1000);
        return new Limits(configuration.getMinimum(),configuration.getMaximum());

    }
}
