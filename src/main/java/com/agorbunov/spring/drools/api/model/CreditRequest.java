package com.agorbunov.spring.drools.api.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.Date;

public class CreditRequest {

    @JsonFormat(pattern="dd-MMM-yyyy", locale = "en_US")
    private Date applicDate;

    private String programCode;

    private int askTermNumber;

    private int askTotalCreditQty;

    private String rateKds;

    private Borrower borrower;

    public Date getApplicDate() {
        return applicDate;
    }

    public void setApplicDate(Date applicDate) {
        this.applicDate = applicDate;
    }

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

    public String getRateKds() {
        return rateKds;
    }

    public void setRateKds(String rateKds) {
        this.rateKds = rateKds;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }
}
