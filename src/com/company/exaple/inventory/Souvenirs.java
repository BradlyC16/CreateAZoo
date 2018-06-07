package com.company.exaple.inventory;

public class Souvenirs extends Items{

    private String type;
    private int idNumber;

    public Souvenirs(double price, String itemName, String quantity, int dateRecevived, String type, int idNumber) {
        super(price, itemName, quantity, dateRecevived);
        this.type = type;
        this.idNumber = idNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
