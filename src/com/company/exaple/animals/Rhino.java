package com.company.exaple.animals;

public class Rhino extends Animal {

    private double hornStize;
    private String type;
    private boolean isEndangered;

    public Rhino(String name, String locaton, char gender, double weight, String type) {
        super(name, locaton, gender, weight);
        this.type = type;
    }

    public double getHornStize() {
        return hornStize;
    }

    public void setHornStize(double hornStize) {
        this.hornStize = hornStize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }
}
