package com.javatechie.spring.drools.api;

public class CreditRequest {

    private String programCode;

    private int askTermNumber;

    private int askTotalCreditQty;

    private double rate;

    private String info;

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public int getAskTermNumber() {
        return askTermNumber;
    }

    public void setAskTermNumber(int askTermNumber) {
        this.askTermNumber = askTermNumber;
    }

    public int getAskTotalCreditQty() {
        return askTotalCreditQty;
    }

    public void setAskTotalCreditQty(int askTotalCreditQty) {
        this.askTotalCreditQty = askTotalCreditQty;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void addInfo(String newInfo) {
        this.info = String.format("%s \n %s", this.info, newInfo);
    }
}
