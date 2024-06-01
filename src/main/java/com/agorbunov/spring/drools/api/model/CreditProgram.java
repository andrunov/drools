package com.agorbunov.spring.drools.api.model;

public class CreditProgram {

    private double rate;

    private double minAmount;

    private double maxAmount;

    private int minTermNumber;

    private int maxTermNumber;

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
