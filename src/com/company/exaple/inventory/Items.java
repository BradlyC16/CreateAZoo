package com.company.exaple.inventory;

public class Items {

    private double price;
    private String itemName;
    private int quantity;
    private int dateRecevived;

    public Items(double price, String itemName, int quantity, int dateRecevived) {
        this.price = price;
        this.itemName = itemName;
        this.quantity = quantity;
        this.dateRecevived = dateRecevived;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDateRecevived() {
        return dateRecevived;
    }

    public void setDateRecevived(int dateRecevived) {
        this.dateRecevived = dateRecevived;
    }
}
