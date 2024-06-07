package com.agorbunov.spring.drools.api.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Borrower {

    private String category;

    private boolean cardSalary;

    @JsonFormat(pattern="dd-MMM-yyyy", locale = "en_US")
    private Date childBirht1;

    @JsonFormat(pattern="dd-MMM-yyyy", locale = "en_US")
    private Date childBirht2;

    private boolean hasDisabledChild;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isCardSalary() {
        return cardSalary;
    }

    public void setCardSalary(boolean cardSalary) {
        this.cardSalary = cardSalary;
    }

    public Date getChildBirht1() {
        return childBirht1;
    }

    public void setChildBirht1(Date childBirht1) {
        this.childBirht1 = childBirht1;
    }

    public Date getChildBirht2() {
        return childBirht2;
    }

    public void setChildBirht2(Date childBirht2) {
        this.childBirht2 = childBirht2;
    }

    public boolean isHasDisabledChild() {
        return hasDisabledChild;
    }

    public void setHasDisabledChild(boolean hasDisabledChild) {
        this.hasDisabledChild = hasDisabledChild;
    }
}
