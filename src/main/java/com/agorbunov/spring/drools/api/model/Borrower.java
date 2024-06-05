package com.agorbunov.spring.drools.api.model;

public class Borrower {

    private String category;

    private boolean cardSalary;

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
}
