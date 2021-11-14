package com.performanceengineering.customerdashboard.model;

public class accountdetailsmodel {

    private String accId;
    private String accnumber;
    private String accountCreationDate;
    private String accountCategory;

    public accountdetailsmodel() {
    }

    public accountdetailsmodel(String accId, String accnumber, String accountCreationDate, String accountCategory) {
        this.accId = accId;
        this.accnumber = accnumber;
        this.accountCreationDate = accountCreationDate;
        this.accountCategory = accountCategory;
    }

    public String getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(String accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public String getAccountCategory() {
        return accountCategory;
    }

    public void setAccountCategory(String accountCategory) {
        this.accountCategory = accountCategory;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getAccnumber() {
        return accnumber;
    }

    public void setAccnumber(String accnumber) {
        this.accnumber = accnumber;
    }

}
