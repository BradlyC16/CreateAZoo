package com.company.exaple.animals;

public class Lion extends Animal {

    private double noseLength;
    private double maneLength;
    private boolean isTrained;

    public Lion(String name, String locaton, char gender, double weight, double noseLength, double maneLength) {
        super(name, locaton, gender, weight);
        this.noseLength = noseLength;
        this.maneLength = maneLength;
    }

    public double getNoseLength() {
        return noseLength;
    }

    public void setNoseLength(double noseLength) {
        this.noseLength = noseLength;
    }

    public double getManeLength() {
        return maneLength;
    }

    public void setManeLength(double maneLength) {
        this.maneLength = maneLength;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }
}
