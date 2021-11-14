package com.performanceengineering.customerdashboard.model;

import java.util.List;

public class dashboarditemmodel {

    // This is the data model of the experience service
    private String userID;
    private String userName;
    private String accId;
    private String accnumber;
    private String type;
    private int balance;
    private accountdetailsmodel accountdetails;
    private List<accounttransactionsmodel> accounttransactions;

    public dashboarditemmodel() {
    }

    public dashboarditemmodel(String userID, String userName, String accId, String accnumber, String type, int balance,
            accountdetailsmodel accountdetails, List<accounttransactionsmodel> accounttransactions) {
        this.userID = userID;
        this.userName = userName;
        this.accId = accId;
        this.accnumber = accnumber;
        this.type = type;
        this.balance = balance;
        this.accountdetails = accountdetails;
        this.accounttransactions = accounttransactions;
    }

    public List<accounttransactionsmodel> getAccounttransactions() {
        return accounttransactions;
    }

    public void setAccounttransactions(List<accounttransactionsmodel> accounttransactions) {
        this.accounttransactions = accounttransactions;
    }

    public accountdetailsmodel getAccountdetails() {
        return accountdetails;
    }

    public void setAccountdetails(accountdetailsmodel accountdetails) {
        this.accountdetails = accountdetails;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccnumber() {
        return accnumber;
    }

    public void setAccnumber(String accnumber) {
        this.accnumber = accnumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
