package com.cambeeler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

// Still need JSON file for retaining information - or some record w/protocol
// Still need utilities for refresh screen
// All objects will need references to the logs
// All objects will need reference to the 'scanner', except Contacts.
// only the Phone book will have access to the contact records
// main only provides a reference point for access to the Mobile Phone itself

public class Main {
    public static Scanner scan = new Scanner(System.in);
    private static CodeFlowLogs logs;
    private static Contacts contact;
    private static MobilePhone mp;

    static {
        try {
            logs = new CodeFlowLogs("/Users/cam/JAVAapplogs.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String inputString;

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        String input;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your Choice:");
            input = scan.nextLine();
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                quit = true;
                System.out.println("Turn off the Lights");
                break;
//                System.out.println("Please enter a number this time");
//                continue;
            }

            switch (choice) {
                case 1:
                    printInstructions();
                    break;

                case 2:
                    turnOnPhone();
//                    turnOffPhone();
                    break;

                default:
                    System.out.println("Turn off the Lights");
                    logs.closeFile();
                    quit = true;
                    break;
            }


        }
        scan.close();
    }

    public static void printInstructions(){
        logs.printLogs("printInstructions - Entry");

        System.out.println("\nPlease choose:\n");
        System.out.println("Option 1 - to see the list of options");
        System.out.println("Option 2 - Open up Mobile Phone");
        System.out.println("Any other selection - Exit");

        logs.printLogs("printInstructions - Exit");

    }

    public static void turnOnPhone(){
        logs.printLogs("turnOnPhone - Entry");
        MobilePhone mp = new MobilePhone(logs);

        logs.printLogs("turnOnPhone - Exit");
    }

    public static void turnOffPhone(){
        logs.printLogs("turnOffPhone - Entry");
        logs.closeFile();

    }


}
