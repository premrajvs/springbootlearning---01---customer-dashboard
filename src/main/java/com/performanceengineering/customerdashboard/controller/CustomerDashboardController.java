package com.performanceengineering.customerdashboard.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.performanceengineering.customerdashboard.model.accountitemmodel;
import com.performanceengineering.customerdashboard.model.accounttransactionsmodel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerdashboard")
public class CustomerDashboardController {

    @RequestMapping("/{userId}")
    public List<accountitemmodel> getAccountItem(@PathVariable("userId") String userid) {

        List<accounttransactionsmodel> accountsandtransactions = Arrays.asList(
                new accounttransactionsmodel("1", "tr-001-000-112"),
                new accounttransactionsmodel("2", "tr-002-002-222"));

                accountsandtransactions.stream().map()
        return Collections.singletonList(new accountitemmodel("1234", "savings", 1));
    }
}
