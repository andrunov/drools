package com.agorbunov.spring.drools.api.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CreditProgram {


    @JsonFormat(pattern="dd-MMM-yyyy", locale = "en_US")
    private Date date;

    private String programCode;

    private double rate;

    private double minAmount;

    private double maxAmount;

    private int minTermNumber;

    private int maxTermNumber;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(double minAmount) {
        this.minAmount = minAmount;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public int getMinTermNumber() {
        return minTermNumber;
    }

    public void setMinTermNumber(int minTermNumber) {
        this.minTermNumber = minTermNumber;
    }

    public int getMaxTermNumber() {
        return maxTermNumber;
    }

    public void setMaxTermNumber(int maxTermNumber) {
        this.maxTermNumber = maxTermNumber;
    }
}
