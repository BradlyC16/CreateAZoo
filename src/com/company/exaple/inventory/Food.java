package com.company.exaple.inventory;

public class Food extends Items{

    private String catigory;
    private int exprationDate;
    private boolean refridgerated;

    public Food(double price, String itemName, String quantity, int dateRecevived, String catigory, int exprationDate, boolean refridgerated) {
        super(price, itemName, quantity, dateRecevived);
        this.catigory = catigory;
        this.exprationDate = exprationDate;
        this.refridgerated = refridgerated;
    }

    public String getCatigory() {
        return catigory;
    }

    public void setCatigory(String catigory) {
        this.catigory = catigory;
    }

    public int getExprationDate() {
        return exprationDate;
    }

    public void setExprationDate(int exprationDate) {
        this.exprationDate = exprationDate;
    }

    public boolean isRefridgerated() {
        return refridgerated;
    }

    public void setRefridgerated(boolean refridgerated) {
        this.refridgerated = refridgerated;
    }
}
