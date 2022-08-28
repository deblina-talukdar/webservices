package com.deblinaprojects.org.webservices.controllers;

import com.deblinaprojects.org.webservices.config.ConfigurationLimits;
import com.deblinaprojects.org.webservices.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private ConfigurationLimits configurationLimits;

    @GetMapping(value = "/limits", produces = MediaType.APPLICATION_JSON_VALUE)
    public Limits getLimits() {
        return new Limits(configurationLimits.getMin(), configurationLimits.getMax());
    }
}
