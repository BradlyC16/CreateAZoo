package com.company.exaple;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);

    public void mainMenu() {

        try {
            System.out.println("Please Select an option." +
                    "\n1. Manage People" +
                    "\n2. Manage Animals" +
                    "\n3. Mange Inventory" +
                    "\n4 Exit Program");

//        Handles user input for navigation
            switch (input.nextInt()) {
                case 1:
//                Manage Poeple
                    managePeople();
                    break;
                case 2:
//                Manage Animals
                    manageAnimals();
                    break;
                case 3:
//                Manage Inventory
                    manageInventory();
                    break;
//                Exit Program
                case 4:
                    System.out.println("Thank you for using the Jungle Zoo Program");
                    System.exit(0);
                    break;
                default:
//                Handle wrong number
                    System.out.println("Not an valid entry. Please enter a number between 1 & 4");
//                Restart method to allow to try again
                    mainMenu();
                    break;
            }
        } catch (InputMismatchException ime) {
//            Handle if a user puts in something that's not an int
            input.nextLine();
            System.out.println("Not an valid entry. Please enter a number between 1 & 4");
            mainMenu();
        }
    }

    // Handles People Options
    private void managePeople() {
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
                    break;
                case 2:
//            Handle Visitor
                    break;
                case 3:
//            Handle going back to the mainMenu()
                    break;
                case 4:
//            Handle exiting the program
                default:
//          Handle incorrect input
                    break;
            }
        } catch (InputMismatchException ime) {
//    Handle any input that's not an in
            System.out.println("Not an valid entry. Please enter a number between 1 & 4");
            managePeople();
        }

        try {
//            Enter code here that you would like to run that MAY throw an exception
        } catch (InputMismatchException ime) {
//            what you want your program to do IF this exception happens
        }
    }
        // Handles Animal Options
        private void manageAnimals () {

        }

        // Handles Inventory Options
        private void manageInventory () {

        }
    }
