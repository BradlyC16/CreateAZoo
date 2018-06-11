package com.company.exaple.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PeopleMenu {

    private Scanner input = new Scanner(System.in);

    // Handles People Options
    protected void managePeople() {

        try {
//Find out out what type of person we need to manage.
            System.out.println("Are you " +
                    "\n1. an Employee" +
                    "\n2. a Visitor" +
                    "\n3. Go Back" +
                    "\n4. Exit");

            switch (input.nextInt()) {
                case 1:
//            Handle Employee
                    manageEmployee();
                    break;
                case 2:
//            Handle Visitor
                    manageVisitor();
                    break;
                case 3:
//            Handle going back to the mainMenu()
                    Menu menu = new Menu();
                    menu.mainMenu();
                    break;
                case 4:
//            Handle exiting the program
                    System.out.println("Thank you for using the Jungle Zoo Program");
                    managePeople();
                default:
//          Handle incorrect input
                    System.out.println("Not an valid entry. Please enter a number between 1 & 4");
                    managePeople();
                    break;
            }
        } catch (InputMismatchException ime) {
//    Handle any input that's not an in
            System.out.println("Not an valid entry. Please enter a number between 1 & 4");
            managePeople();
        }

    }

    private void manageEmployee() {

        System.out.println("You are in the Employee Menu" +
                "\nWhat would you like to do:" +
                "\n1. Create New Employee" +
                "\n2. View All Employees" +
                "\n3. Remove an Employee" +
                "\n4. Edit an Employee" +
                "\n5. Go back" +
                "\n6. Exit Program");
        try {
            switch (input.nextInt()) {
                case 1:
//              Create new Employee
                    break;
                case 2:
//              View All Employees
                    break;
                case 3:
//              Remove Employee
                    break;
                case 4:
//              Exit Employee
                    break;
                case 5:
//              Go Back
                    managePeople();
                    break;
                case 6:
//              Exit Program
                    System.exit(0);
                    break;
                default:
//              Handle if an incorrect number is put in
                    System.out.println("That is not a valid entry. Please enter a number between 1 and 6");
                    break;
            }
        } catch (InputMismatchException ime) {
            input.nextInt();
            System.out.println("That is not a valid entry. Please enter a number between 1 and 6");
            manageEmployee();
        }
    }

    private void manageVisitor() {
        System.out.println("You are in the Visitor Menu" +
                "\nWhat would you like to do:" +
                "\n1. Create New Visitor" +
                "\n2. View All Visitors" +
                "\n3. Remove an Visitor" +
                "\n4. Edit an Visitor" +
                "\n5. Go back" +
                "\n6. Exit Program");
        try {
            switch (input.nextInt()) {
                case 1:
//              Create new Visitor
                    break;
                case 2:
//              View All Visitor
                    break;
                case 3:
//              Remove Visitor
                    break;
                case 4:
//              Exit Visitor
                    break;
                case 5:
//              Go Back
                    managePeople();
                    break;
                case 6:
//              Exit Program
                    System.exit(0);
                    break;
                default:
//              Handle if an incorrect number is put in
                    System.out.println("That is not a valid entry. Please enter a number between 1 and 6");
                    break;
            }
        } catch (InputMismatchException ime) {
            input.nextInt();
            System.out.println("That is not a valid entry. Please enter a number between 1 and 6");
            manageVisitor();
        }
    }
}