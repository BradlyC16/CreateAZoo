package com.company.exaple.animals;

public class Penguin extends Animal {

    private String type;
    private String featherType;
    private String WingSpan;

    public Penguin(String name, String locaton, char gender, double weight, String type, String featherType, String wingSpan) {
        super(name, locaton, gender, weight);
        this.type = type;
        this.featherType = featherType;
        WingSpan = wingSpan;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFeatherType() {
        return featherType;
    }

    public String getWingSpan() {
        return WingSpan;
    }

    public void setWingSpan(String wingSpan) {
        WingSpan = wingSpan;
    }
}
