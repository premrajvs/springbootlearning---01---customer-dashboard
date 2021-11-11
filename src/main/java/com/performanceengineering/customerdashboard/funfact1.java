package com.performanceengineering.customerdashboard;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class funfact1 {

    private int factid;
    private String factinfo;
    private Date facthappeningdate;
    private static int iCallCount = 0;

    private funfactdependecyclass dependencyobject;

    public funfact1() {
        iCallCount++;
        System.out.println("Fun Fact object count : " + iCallCount);
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
        dependencyobject.showdependency();
    }

}
