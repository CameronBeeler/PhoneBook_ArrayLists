package com.cambeeler;

public class Contacts {
    private String lName;
    private String fName;
    private String email;
    private long phoneNbr;
    private CodeFlowLogs logs;

    public Contacts(CodeFlowLogs logs) {
        this.logs = logs;
    }

    public Contacts(String fName, String lName, String email, int phoneNbr, CodeFlowLogs logs) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phoneNbr = phoneNbr;
        this.logs = logs;
    }

    public String getlName() {
        logs.printLogs("Contacts::getlName - Entry");
        logs.printLogs("Contacts::getlName - Exit");

        return lName;
    }

    public void setlName(String lName) {
        logs.printLogs("Contacts::setlName - Entry");
        logs.printLogs("Contacts::setlName - Exit");

        this.lName = lName;
    }

    public String getfName() {
        logs.printLogs("Contacts::getfName - Entry");
        logs.printLogs("Contacts::getfName - Exit");

        return fName;
    }

    public void setfName(String fName) {
        logs.printLogs("Contacts::setfName - Entry");
        logs.printLogs("Contacts::setfName - Exit");

        this.fName = fName;
    }

    public long getPhoneNbr() {
        logs.printLogs("Contacts::getPhoneNbr - Entry");
        logs.printLogs("Contacts::getPhoneNbr - Exit");

        return phoneNbr;
    }

    public void setPhoneNbr(long phoneNbr) {
        logs.printLogs("Contacts::setPhoneNbr - Entry");
        logs.printLogs("Contacts::setPhoneNbr - Exit");

        this.phoneNbr = phoneNbr;
    }



}
