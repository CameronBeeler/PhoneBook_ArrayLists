package com.cambeeler;

// Collection class of all contacts - each contact is an object
// the methods to open, load, add, update, delete & store contacts
// the presentation of the contact options
//
//    https://stackoverflow.com/questions/31728446/write-a-json-file-in-java
//    www.avajava.com/tutorials/lessons/how-do-i-write-an-object-to-a-file-and-read-it-back.html

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private static int phonebookcount;
    private CodeFlowLogs logs;
    private ArrayList<Contacts> contactlist = new ArrayList<Contacts>();
    private Scanner scan = new Scanner(System.in);

    public PhoneBook(CodeFlowLogs logs) {
        this.logs = logs;
        if(phonebookcount>1){
            logs.printLogs("PhoneBook::Constructor - Error, can only have 1 phone book open");

        } else {        selectPhoneBookOptions();}
    }



    //    Create a print options for Contact app.  To exit the app is to return control back to Mobile Phone.
// METHODS
    public void displayContactOptions(){
        logs.printLogs("PhoneBook::displayContactOptions - Entry");
        logs.printLogs("PhoneBook::displayContactOptions - Exit");
    }

    // When reaccessing the Contacts, make sure to read the existing contacts into the Array from the store
    public void loadContactArray(){
        logs.printLogs("PhoneBook::loadContactArray - Entry");
        logs.printLogs("PhoneBook::loadContactArray - Exit");
    }

    // When list changes, make sure to save changes to disk
    public void saveContactArray(){
        logs.printLogs("PhoneBook::saveContactArray - Entry");
        logs.printLogs("PhoneBook::saveContactArray - Exit");
    }


    public Contacts addContact(){
        logs.printLogs("PhoneBook::addContact - Entry");
        Contacts c = new Contacts(logs);
        System.out.print("Please enter First Name:");
        c.setfName(scan.nextLine());
        System.out.print("Please enter Last Name:");
        c.setlName(scan.nextLine());
        System.out.print("Please enter phone number:");
        c.setPhoneNbr(scan.nextLong());
//        System.out.print("Please enter email:");

// load the contact list
// add the contact to the list
// sort order the contact list
// return the contact list to the store.
// Clear the array
        logs.printLogs("PhoneBook::addContact - Exit");
        return c;
    }

    public void displayContacts(){

        for (int i=0; i< contactlist.size();i++){
            System.out.println("Contact# "+ (i+1) + "\n" +
                    "\tFirst Name:  " + contactlist.get(i).getfName() +
                    "\n\tLast Name :  " + contactlist.get(i).getlName() +
                    "\n\tPhone nbr :  " + contactlist.get(i).getPhoneNbr() +
                    "\n\n");
        }

    }

    public void updateContact(){
        logs.printLogs("PhoneBook::updateContact - Entry");
// load the contact list
// locate the contact record
// View the record and provide modification options (another function for presentation and one for updates, and then return to display & modification
// sort order the contact list
// return the contact list to the store.
// Clear the array
        logs.printLogs("PhoneBook::updateContact - Exit");
    }
    public void removeContact(){
        logs.printLogs("PhoneBook::removeContact - Entry");
        logs.printLogs("PhoneBook::removeContact - Exit");
    }
    public void findContact(){
        logs.printLogs("PhoneBook::findContact - Entry");
        logs.printLogs("PhoneBook::findContact - Exit");
    }

    public void displayPhoneBookOptions() {
        logs.printLogs("PhoneBook::displayPhoneBookOptions - Entry");

        System.out.println("\nPhone Options:\n");
        System.out.println("Option 1 - to see the list of options");
        System.out.println("Option 2 - Find a Contact");
        System.out.println("Option 3 - Add a Contact");
        System.out.println("Option 4 - Update Contact");
        System.out.println("Option 4 - Delete a Contact");
        System.out.println("Any other selection - Finishd");

        logs.printLogs("PhoneBook::displayPhoneBookOptions - Exit");
    }

    public void selectPhoneBookOptions() {
        boolean quit = false;
        int choice = 0;
        String input;



        while (!quit) {
            displayPhoneBookOptions();
            scan.nextLine();
            System.out.println("Enter your Phonebook option:");
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
                    displayPhoneBookOptions();
                    break;

                case 2:
                    findContact();
                    break;

                case 3:
                    contactlist.add(addContact());
                    displayContacts();
//                    saveContactArray();
                    break;

                case 4:
                    updateContact();
                    saveContactArray();
                    break;

                case 5:
                    removeContact();
                    saveContactArray();
                    break;

                default:
                    System.out.println("Turn off the Lights");
                    logs.closeFile();
                    quit = true;
                    break;
            }


        }
//        scan.close();
    }
}
