package com.ElementaryTasks.FilesParser;

import java.io.IOException;

public class Main {

    //private static final String PATH_TO_FILE_READ = "D:\\Softserve\\Java_Elementary_Tasks\\Elementary_Tasks\\src\\com\\ElementaryTasks\\FilesParser\\lorem_ipsum.txt";
    private static final String PATH_TO_FILE_WRITE = "D:\\Softserve\\Java_Elementary_Tasks\\Elementary_Tasks\\src\\com\\ElementaryTasks\\FilesParser\\REPLACEMENT_STRING.txt";
    //private static final String SUBSTRING = "loReM IpsuM";
    //private static final String REPLACEMENT_STRING = "REPLACEMENT STRING";

    private static String PATH_TO_FILE_READ;
    private static String SUBSTRING;
    private static String REPLACEMENT_STRING;

    public static void main(String[] args) throws IOException, InterruptedException {

        getParametersAndRunMode();

    }

    public static void getParametersAndRunMode() throws IOException, InterruptedException {

        String mode = DataFromUser.modeSelection();

        if (mode.equals("1")) {
            System.out.print("Введите путь к файлу в формате: D:\\...<path>...\\<name>.txt :>");
            PATH_TO_FILE_READ = DataFromUser.enterParameters();
            System.out.print("Введите строку для поиска:> ");
            SUBSTRING = DataFromUser.enterParameters();
            runModeOne();


        } else if (mode.equals("2")) {
            System.out.print("Введите путь к файлу в формате: D:\\...<path>...\\<name>.txt :>");
            PATH_TO_FILE_READ = DataFromUser.enterParameters();
            System.out.print("Введите строку для поиска и замены:> ");
            SUBSTRING = DataFromUser.enterParameters();
            System.out.print("Введите строку на которую нужно заменить найденную:> ");
            REPLACEMENT_STRING = DataFromUser.enterParameters();
            runModeTwo();

            System.out.println();
            System.out.println("Для просмотра текста с заменой строки откройте файл REPLACEMENT_STRING.txt");
            System.out.println("Путь к файлу: D:\\Softserve\\Java_Elementary_Tasks\\Elementary_Tasks\\src\\com\\ElementaryTasks\\FilesParser\\REPLACEMENT_STRING.txt");

        }


    }

    //================================================ mode 1 ====================================================
    public static void runModeOne() {
        MyFileReader myFileReader = new MyFileReader();

        try {
            myFileReader.readerFromFileToCountSubstring(PATH_TO_FILE_READ, SUBSTRING);
        } catch (IOException e) {
            System.out.println("Не могу открыть данный файл. Проверьте правильность указанного пути!");
        }

    }

    //================================================ mode 2 ====================================================
    public static void runModeTwo() throws IOException {
        MyFileReader myFileReader = new MyFileReader();

        try {
            myFileReader.readerFromFileToReplaceSubstring(PATH_TO_FILE_READ, SUBSTRING, REPLACEMENT_STRING);
        } catch (IOException e) {
            System.out.println("Не могу открыть данный файл. Проверьте правильность указанного пути!");
        }

        //====================================== write to file in mode 2 =================================
        MyFileWriter myFileWriter = new MyFileWriter();
        myFileWriter.writeToFileReplacementString(PATH_TO_FILE_WRITE,
                myFileReader.readerFromFileToReplaceSubstring(PATH_TO_FILE_READ, SUBSTRING, REPLACEMENT_STRING));
    }


}
