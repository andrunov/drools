package com.agorbunov.spring.drools.api.model;

public class Reester {
    private CreditRequest creditRequest;

    private CreditProgram creditProgram;

    private String info;

    private String warning;

    private String error;


    public CreditRequest getCreditRequest() {
        return creditRequest;
    }

    public void setCreditRequest(CreditRequest creditRequest) {
        this.creditRequest = creditRequest;
    }

    public CreditProgram getCreditProgram() {
        return creditProgram;
    }

    public void setCreditProgram(CreditProgram creditProgram) {
        this.creditProgram = creditProgram;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
