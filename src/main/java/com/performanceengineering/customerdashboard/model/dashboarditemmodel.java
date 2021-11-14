package com.performanceengineering.customerdashboard.model;

public class dashboarditemmodel {

    private String accnumber;
    private String type;
    private int balance;

    public dashboarditemmodel(String accnumber, String type, int balance) {
        this.accnumber = accnumber;
        this.type = type;
        this.balance = balance;
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
