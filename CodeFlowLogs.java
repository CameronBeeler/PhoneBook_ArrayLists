package com.cambeeler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class CodeFlowLogs {
    private String resolvedFileName;
    private File file;
    private FileWriter fr;
    private BufferedWriter br;
    private Scanner scan = new Scanner(System.in);

// Constructors
    public CodeFlowLogs(String resolvedFileName) throws IOException{
        this.resolvedFileName = resolvedFileName;
        this.file = new File(resolvedFileName); // this creates the file

        try{
            this.fr = new FileWriter((resolvedFileName), true);
            this.br = new BufferedWriter(fr);

            if (!file.exists()) {   // checks whether the file is Exist or not
                file.createNewFile();   // here if file not exist new file created
                this.printLogs("Created new File\n");
            }
            this.printLogs("Using existing File\n");

        } catch(IOException e){
            e.printStackTrace();
        }


    }
// Getters & Setters
// the log object will utilize file references, own filewrite & bufferwriting.

    public File getFile(){
        return this.file;
    }

    public FileWriter getFileWriter(){
        return this.fr;
    }

    public BufferedWriter getBufferedWriter(){
        return this.br;
    }

    public String getResolvedFileName(){
        return this.resolvedFileName;
    }


    // METHODS

    public void closeFile(){
//        String resolvedFileName = getResolvedFileName();
        File file = getFile();
        FileWriter fr = getFileWriter();
        BufferedWriter br = getBufferedWriter();
        try {
            if (!file.exists()) {   // checks whether the file is Exist or not
                System.out.println("CodeFlowLogs::printLogs - file does not exist");
                file.createNewFile();   // here if file not exist new file created - resilience if file is deleted.
            }

            br.flush();
            br.close();
            fr.close();
        }catch (IOException e){ e.printStackTrace();}
    }

    public void printLogs(String inputLog) {
//    String text = "Text to save to file";
// Files.write(Paths.get("./fileName.txt"), text.getBytes());
        File file = getFile();
        FileWriter fr = getFileWriter();
        BufferedWriter br = getBufferedWriter();
        String resolvedFileName = getResolvedFileName();
        String dataWithNewLine = inputLog + System.getProperty("line.separator");


        try {
            if (!file.exists()) {   // checks whether the file is Exist or not
                System.out.println("CodeFlowLogs::printLogs - file does not exist\n");
                file.createNewFile();   // here if file not exist new file created - resilience if file is deleted.
            }
            br.write(dataWithNewLine);
            br.flush();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
