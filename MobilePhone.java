package com.cambeeler;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    // Quit
// Print list of Contacts
// Add new Contacts
// Update Contact
// Remove Contact
// Search & Find Contact
    private ArrayList<Contacts> contactList = new ArrayList<Contacts>();
    PhoneBook pb;
    private Contacts contact;
    private CodeFlowLogs logs;
    private Scanner scan = new Scanner(System.in);
// Constructor

    public MobilePhone(CodeFlowLogs logs) {
        this.logs = logs;
        logs.printLogs("MobilePhone::Constructor1 - exit");
        selectMobilePhoneOptions();

    }

//    public MobilePhone(Contacts contact, CodeFlowLogs logs) {
//        this.contact = contact;
//        this.logs = logs;
//        selectMobilePhoneOptions();
//        logs.printLogs("MobilePhone::Constructor2 - exit");
//    }
//    // Setters & Getters


// Methods


    // add method to display option
    // include Contacts which passes control to Contacts app
    // METHODS
    public void displayMobilePhoneOptions() {
        logs.printLogs("MobilePhone::displayMobilePhoneOptions - Entry");

        System.out.println("\nPhone Options:\n");
        System.out.println("Option 1 - to see the list of options");
        System.out.println("Option 2 - Open up Contacts");
        System.out.println("Any other selection - Exit & Close Mobile Phone");

        logs.printLogs("MobilePhone::displayMobilePhoneOptions - Exit");
    }

    public void selectMobilePhoneOptions() {
        boolean quit = false;
        int choice = 0;
        String input;

        displayMobilePhoneOptions();
        while (!quit) {

            System.out.println("Enter Mobile Phone App choice:");
            input = scan.nextLine();
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                quit = true;
                System.out.println("Exit the phone");
                break;
//                System.out.println("Please enter a number this time");
//                continue;
            }

            switch (choice) {
                case 1:
                    displayMobilePhoneOptions();
                    break;

                case 2:
                    turnOnPhone();
                    turnOffPhone();
                    break;

                default:
                    System.out.println("Turn off the Lights");
                    logs.closeFile();
                    quit = true;
                    break;
            }


        }
    }

    public void turnOnPhone() {
        logs.printLogs("MobilePhone::turnOnPhone - Entry");
        PhoneBook pb = new PhoneBook(logs);
        logs.printLogs("MobilePhone::turnOnPhone - Exit");

    }

    public void turnOffPhone() {
        logs.printLogs("MobilePhone::turnOffPhone - Entry");

        logs.printLogs("MobilePhone::turnOffPhone - Exit");
    }

}
