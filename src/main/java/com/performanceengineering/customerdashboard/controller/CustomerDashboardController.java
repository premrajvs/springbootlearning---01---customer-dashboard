package com.performanceengineering.customerdashboard.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.performanceengineering.customerdashboard.model.accountdetailsmodel;
import com.performanceengineering.customerdashboard.model.accounttransactionsmodel;
import com.performanceengineering.customerdashboard.model.dashboarditemmodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/customerdashboard")
public class CustomerDashboardController {

        @Autowired
        private RestTemplate rt;

        @RequestMapping("/{userId}")
        public List<dashboarditemmodel> getDashboardItems(@PathVariable("userId") String userid) {

                // RestTemplate rt = new RestTemplate();

                // rt.getForObject("http://localhost:8092/accountdetails/1",
                // accountdetailsmodel.class);
                // Call Account Transactions Service and get list of account ID and Transaction
                // IDs for the User ID
                // SAMPLE DATA
                List<accountdetailsmodel> accountdetailscollection = Arrays.asList(
                                new accountdetailsmodel("1", "100-100-100-100", "10-01-2021", "Platinum"),
                                new accountdetailsmodel("2", "200-200-200-200", "20-02-2021", "gold"));

                List<accounttransactionsmodel> accountstransactionscollection = Arrays.asList(
                                new accounttransactionsmodel("1", "tr-001-000-111", 52, "11-13-2021"),
                                new accounttransactionsmodel("1", "tr-002-000-112", 27, "11-13-2021"),
                                new accounttransactionsmodel("1", "tr-003-000-113", 12, "11-13-2021"),
                                new accounttransactionsmodel("2", "tr-001-000-111", 52, "02-02-2021"),
                                new accounttransactionsmodel("2", "tr-002-000-112", 27, "02-02-2021"),
                                new accounttransactionsmodel("2", "tr-003-000-113", 12, "02-02-2021"));

                List<dashboarditemmodel> dashboarddatasample = Arrays.asList(new dashboarditemmodel("p01", "prem", "1",
                                accountdetailscollection.get(0).getAccnumber(), "checking", 100,
                                accountdetailscollection.get(1), accountstransactionscollection));

                // EXTERNAL ITERATIONS

                dashboarditemmodel datasample2 = new dashboarditemmodel();
                datasample2.setAccId("1");
                datasample2.setBalance(100);
                datasample2.setType("checking");
                datasample2.setUserID("p01");
                datasample2.setUserName("prem");

                for (accountdetailsmodel eachaccountdetail : accountdetailscollection) {
                        if (eachaccountdetail.getAccId().equalsIgnoreCase(datasample2.getAccId())) {
                                datasample2.setAccnumber(eachaccountdetail.getAccId());
                                datasample2.setAccountdetails(eachaccountdetail);
                                ;
                        }
                }

                List<accounttransactionsmodel> listoftransactions = new ArrayList<accounttransactionsmodel>();
                for (accounttransactionsmodel eachtransaction : accountstransactionscollection) {
                        if (eachtransaction.getAccId().equalsIgnoreCase(datasample2.getAccId())) {
                                accounttransactionsmodel eachtransactionnew = new accounttransactionsmodel();
                                eachtransactionnew.setAccId(eachtransaction.getAccId());
                                eachtransactionnew.setTransactionId(eachtransaction.getTransactionId());
                                eachtransactionnew.setTransactionamout(eachtransaction.getTransactionamout());
                                eachtransactionnew.setTransactiondate(eachtransaction.getTransactiondate());

                                listoftransactions.add(eachtransactionnew);
                                System.out.println("Transaction added");
                        }
                        datasample2.setAccounttransactions(listoftransactions);
                }

                /*
                 * Predicate<accountdetailsmodel> predicateImplementation = new
                 * Predicate<accountdetailsmodel>() { public boolean test(accountdetailsmodel t)
                 * { if (t.getAccId().equalsIgnoreCase(datasample2.getAccId())) return true;
                 * else return false; }
                 * 
                 * };
                 */

                // STREAM IMPLEMENTATION

                // Stream<accountdetailsmodel> s1old = accountdetailscollection.stream();

                // RestTemplate rt = new RestTemplate();
                String accountdetails_baseurl = "http://localhost:8092/accountdetails/";
                HttpHeaders headers = new HttpHeaders();
                HttpEntity<List<accountdetailsmodel>> requestEntity = new HttpEntity<>(headers);
                ResponseEntity<List<accountdetailsmodel>> responseEntity = rt.exchange(accountdetails_baseurl + "1",
                                HttpMethod.GET, requestEntity,
                                new ParameterizedTypeReference<List<accountdetailsmodel>>() {
                                });

                Stream<accountdetailsmodel> s1 = responseEntity.getBody().stream();
                List<accountdetailsmodel> accountdetailscollection2 = s1
                                .filter(t -> t.getAccId().equalsIgnoreCase(datasample2.getAccId()))
                                .collect(Collectors.toList());

                String accounttransactions_baseurl = "http://localhost:8093/accounttransactions/";
                ResponseEntity<List<accounttransactionsmodel>> responseEntity1 = rt.exchange(
                                accounttransactions_baseurl + "1", HttpMethod.GET, requestEntity,
                                new ParameterizedTypeReference<List<accounttransactionsmodel>>() {
                                });

                // Stream<accounttransactionsmodel> s2old =
                // accountstransactionscollection.stream();
                Stream<accounttransactionsmodel> s2 = responseEntity1.getBody().stream();

                List<accounttransactionsmodel> accountstransactionscollection2 = s2
                                .filter(t -> t.getAccId().equalsIgnoreCase(datasample2.getAccId()))
                                .collect(Collectors.toList());

                // For each of the account IDs returned, get the list of account details -
                return Arrays.asList(new dashboarditemmodel("p01", "prem", "1",
                                accountdetailscollection2.get(0).getAccnumber(), "checking", 100,
                                accountdetailscollection2.get(0), accountstransactionscollection2));

                // return Collections.singletonList(new accountitemmodel("1234", "savings", 1));
        }
}
