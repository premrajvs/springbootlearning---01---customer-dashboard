package com.performanceengineering.customerdashboard;

import java.util.Date;

public class funfact1 {

    private int factid;
    private String factinfo;
    private Date facthappeningdate;
    private static int iObjectCount = 0;

    public funfact1() {
        iObjectCount++;
        System.out.println("Fun Fact object count : " + iObjectCount);
    }

    public funfact1(int factid, String factinfo, Date facthappeningdate) {
        this.factid = factid;
        this.factinfo = factinfo;
        this.facthappeningdate = facthappeningdate;
    }

    public int getFactid() {
        return factid;
    }

    public void setFactid(int factid) {
        this.factid = factid;
    }

    public String getFactinfo() {
        return factinfo;
    }

    public void setFactinfo(String factinfo) {
        this.factinfo = factinfo;
    }

    public Date getFacthappeningdate() {
        return facthappeningdate;
    }

    public void setFacthappeningdate(Date facthappeningdate) {
        this.facthappeningdate = facthappeningdate;
    }

    public void showfacts() {
        System.out.println("Fun Facts");
    }

}
