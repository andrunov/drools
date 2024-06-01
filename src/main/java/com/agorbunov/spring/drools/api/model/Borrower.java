package com.agorbunov.spring.drools.api.model;

public class Borrower {

    private String category;

    private boolean cardSalaryClient;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isCardSalaryClient() {
        return cardSalaryClient;
    }

    public void setCardSalaryClient(boolean cardSalaryClient) {
        this.cardSalaryClient = cardSalaryClient;
    }
}
