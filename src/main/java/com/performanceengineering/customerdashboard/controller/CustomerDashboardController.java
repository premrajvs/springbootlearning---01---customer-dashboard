package com.performanceengineering.customerdashboard.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.performanceengineering.customerdashboard.model.accounttransactionsmodel;
import com.performanceengineering.customerdashboard.model.dashboarditemmodel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerdashboard")
public class CustomerDashboardController {

    @RequestMapping("/{userId}")
    public List<dashboarditemmodel> getDashboardItems(@PathVariable("userId") String userid) {

        // Call Account Transactions Service and get list of account ID and Transaction
        // IDs for the User ID
        List<accounttransactionsmodel> accountstransactions = Arrays.asList(
                new accounttransactionsmodel("1", "tr-001-000-112"),
                new accounttransactionsmodel("2", "tr-002-002-222"));

        // For each of the account IDs returned,
        return accountstransactions.stream().map(accountstransaction -> new dashboarditemmodel("1234", "savings", 1))
                .collect(Collectors.toList());
        // return Collections.singletonList(new accountitemmodel("1234", "savings", 1));
    }
}
