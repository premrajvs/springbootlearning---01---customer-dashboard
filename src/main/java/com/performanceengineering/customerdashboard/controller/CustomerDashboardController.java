package com.performanceengineering.customerdashboard.controller;

import java.util.Collections;
import java.util.List;

import com.performanceengineering.customerdashboard.model.accountitemmodel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerdashboard")
public class CustomerDashboardController {

    @RequestMapping("/{userId}")
    public List<accountitemmodel> getAccountItem(@PathVariable("userId") String userid) {
        return Collections.singletonList(new accountitemmodel("1234", "savings", 1));
    }
}
