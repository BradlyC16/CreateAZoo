package com.company.exaple.people;

import java.util.ArrayList;
import java.util.List;

public class Employee extends People {

    private int employeeNumber;
    private String job;
    private String hireDate;
    private int hours;

    private List<Employee> employeeList = new ArrayList<Employee>();

    public Employee() {
    }

    public Employee(int age, String name, char gender, String race, int employeeNumber, String job, String hireDate, int hours) {
        super(age, name, gender, race);
        this.employeeNumber = employeeNumber;
        this.job = job;
        this.hireDate = hireDate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void addEmployee (Employee newEmployee) {

        employeeList.add(newEmployee);
        System.out.println(newEmployee.getName() + " has been added");
    }

}
