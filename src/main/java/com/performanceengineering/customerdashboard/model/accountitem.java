package com.performanceengineering.customerdashboard.model;

public class accountitem {

    private String type;
    private String accnumber;
    private int balance;

    public accountitem(String type, String accnumber, int balance) {
        this.type = type;
        this.accnumber = accnumber;
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
