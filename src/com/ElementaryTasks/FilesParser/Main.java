package com.ElementaryTasks.FilesParser;

import java.io.IOException;

public class Main {
    //private static final String SUBSTRING = "loReM IpSuM";
    //private static final String REPLACEMENT_STRING = "REPLACEMENT STRING";
    //private static final String PATH_TO_FILE_READ = "D:\\Softserve\\Java_Elementary_Tasks\\Elementary_Tasks\\src\\com\\ElementaryTasks\\FilesParser\\lorem_ipsum.txt";
    private static final String PATH_TO_FILE_WRITE = "D:\\Softserve\\Java_Elementary_Tasks\\Elementary_Tasks\\src\\com\\ElementaryTasks\\FilesParser\\REPLACEMENT_STRING.txt";
    private static String PATH_TO_FILE_READ;
    private static String SUBSTRING;
    private static String REPLACEMENT_STRING;

    public static void main(String[] args) throws IOException {

        getParametersAndRun();

    }

    public static void getParametersAndRun() throws IOException {
        String mode = DataFromUser.modeSelection();
        if (mode.equals("1")) {
            System.out.print("Enter path to file in this format: D:\\...<path>...\\<name>.txt :>");
            PATH_TO_FILE_READ = DataFromUser.enterParameters();
            System.out.print("Enter a string to find and count:> ");
            SUBSTRING = DataFromUser.enterParameters();
            runModeOne();

        } else if (mode.equals("2")) {
            System.out.print("Enter path to file in this format: D:\\...<path>...\\<name>.txt :>");
            PATH_TO_FILE_READ = DataFromUser.enterParameters();
            System.out.print("Enter a string to find and replace:> ");
            SUBSTRING = DataFromUser.enterParameters();
            System.out.print("Enter a string you want to chang:> ");
            REPLACEMENT_STRING = DataFromUser.enterParameters();
            runModeTwo();

            System.out.println();
            System.out.println("To view text with line replacement, open the file REPLACEMENT_STRING.txt");
            System.out.println("Path to file: D:\\Softserve\\Java_Elementary_Tasks\\Elementary_Tasks\\src\\com\\ElementaryTasks\\FilesParser\\REPLACEMENT_STRING.txt");
        }
    }
    //mode 1
    public static void runModeOne() {
        MyFileReader myFileReader = new MyFileReader();

        try {
            myFileReader.countString(PATH_TO_FILE_READ, SUBSTRING);
        } catch (IOException e) {
            System.out.println("I cannot open this file. Check if the specified path is correct!");
        }
    }
    //mode 2
    public static void runModeTwo() throws IOException {
        MyFileReader myFileReader = new MyFileReader();

        try {
            myFileReader.replaceString(PATH_TO_FILE_READ, SUBSTRING, REPLACEMENT_STRING);
        } catch (IOException e) {
            System.out.println("I cannot open this file. Check if the specified path is correct!");
        }
        MyFileWriter writer = new MyFileWriter();
        writer.writeToFile(PATH_TO_FILE_WRITE,
                myFileReader.replaceString(PATH_TO_FILE_READ, SUBSTRING, REPLACEMENT_STRING));
    }
}
