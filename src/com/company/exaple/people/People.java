package com.company.exaple.people;

public class People {

    private int age;
    private String name;
    private char gender;
    private char race;

    public People(int age, String name, char gender, char race) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getRace() {
        return race;
    }
}
