package com.company.exaple.animals;

public class Animal {

    private String name;
    private String locaton;
    private char gender;
    private double weight;


    public Animal(String name, String locaton, char gender, double weight) {
        this.name = name;
        this.locaton = locaton;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocaton() {
        return locaton;
    }

    public void setLocaton(String locaton) {
        this.locaton = locaton;
    }

    public char getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
