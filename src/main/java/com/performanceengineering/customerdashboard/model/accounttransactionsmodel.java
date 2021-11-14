package com.performanceengineering.customerdashboard.model;

public class accounttransactionsmodel {
    private String accId;
    private String transactionId;

    public accounttransactionsmodel(String accId, String transactionId) {
        this.accId = accId;
        this.transactionId = transactionId;
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
