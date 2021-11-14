package com.performanceengineering.customerdashboard.model;

public class accounttransactionsmodel {

    // This is the data model for the processor service
    private String accId;
    private String transactionId;
    private int transactionamout;
    private String transactiondate;

    public accounttransactionsmodel() {
    }

    public accounttransactionsmodel(String accId, String transactionId, int transactionamout, String transactiondate) {
        this.accId = accId;
        this.transactionId = transactionId;
        this.transactionamout = transactionamout;
        this.transactiondate = transactiondate;
    }

    public int getTransactionamout() {
        return transactionamout;
    }

    public void setTransactionamout(int transactionamout) {
        this.transactionamout = transactionamout;
    }

    public String getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(String transactiondate) {
        this.transactiondate = transactiondate;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

}
