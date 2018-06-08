package com.company.exaple.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PeopleMenu {

    private Scanner input = new Scanner(System.in);

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
                    Menu menu = new  Menu();
                    menu.mainMenu();
                    break;
                case 4:
//            Handle exiting the program
                    System.out.println("Thank you for using the Jungle Zoo Program");
                    managePeople();
                default:
//          Handle incorrect input
                    break;
            }
        } catch (InputMismatchException ime) {
//    Handle any input that's not an in
            System.out.println("Not an valid entry. Please enter a number between 1 & 4");
            managePeople();
        }

    }

}
