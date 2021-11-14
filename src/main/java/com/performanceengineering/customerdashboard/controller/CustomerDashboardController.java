package com.performanceengineering.customerdashboard.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.performanceengineering.customerdashboard.model.accountdetailsmodel;
import com.performanceengineering.customerdashboard.model.accounttransactionsmodel;
import com.performanceengineering.customerdashboard.model.dashboarditemmodel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/customerdashboard")
public class CustomerDashboardController {

        @RequestMapping("/{userId}")
        public List<dashboarditemmodel> getDashboardItems(@PathVariable("userId") String userid) {

                // RestTemplate rt = new RestTemplate();

                // rt.getForObject("http://localhost:8092/accountdetails/1",
                // accountdetailsmodel.class);
                // Call Account Transactions Service and get list of account ID and Transaction
                // IDs for the User ID

                List<accountdetailsmodel> accountdetailssample = Arrays.asList(
                                new accountdetailsmodel("1", "100-100-100-100", "10-01-2021", "Platinum"),
                                new accountdetailsmodel("2", "200-200-200-200", "20-02-2021", "gold"));

                List<accounttransactionsmodel> accountstransactionssample = Arrays.asList(
                                new accounttransactionsmodel("1", "tr-001-000-111", 52, "11-13-2021"),
                                new accounttransactionsmodel("1", "tr-002-000-112", 27, "11-13-2021"),
                                new accounttransactionsmodel("1", "tr-003-000-113", 12, "11-13-2021"),
                                new accounttransactionsmodel("2", "tr-001-000-111", 52, "02-02-2021"),
                                new accounttransactionsmodel("2", "tr-002-000-112", 27, "02-02-2021"),
                                new accounttransactionsmodel("2", "tr-003-000-113", 12, "02-02-2021"));

                List<dashboarditemmodel> dashboarddatasample = Arrays.asList(new dashboarditemmodel("p01", "prem", "1",
                                accountdetailssample.get(0).getAccnumber(), "checking", 100,
                                accountdetailssample.get(1), accountstransactionssample));

                // For each of the account IDs returned, get the list of account details -
                return dashboarddatasample;
                // return Collections.singletonList(new accountitemmodel("1234", "savings", 1));
        }
}
