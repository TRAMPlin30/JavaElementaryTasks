package com.ElementaryTasks.FilesParser;

import java.io.*;

public class MyFileReader {

    public void readerFromFileToCountSubstring(String filePath, String substring) throws IOException {

        BufferedReader readerBuff = new BufferedReader(new FileReader(filePath));

        String stringFromFile; // = readerBuff.readLine();

        //System.out.println("Содержимое указанного Вами файла: ");
        int i = 0;
        while ((stringFromFile = readerBuff.readLine()) != null) {

            if (stringFromFile.toLowerCase().contains(substring.toLowerCase())) {
                i = i + 1;
            }
            //System.out.println(stringFromFile);
        }
        if (i == 0) {
            System.out.println("В данном тексте указанного слова \"" + substring + "\" нет");
        } else {
            System.out.println("Cлово (словосочетание) \"" + substring + "\" встречается в тексте указанного Вами файла" +
                    " следующее количество раз: " + i + ".");
        }
    }

    public String readerFromFileToReplaceSubstring(String filePath, String substring, String replacementString) throws IOException {

        BufferedReader readerBuff = new BufferedReader(new FileReader(filePath));

        String stringFromFile;
        String newStringFromFile;
        //String toWriteCopy = "";
        StringBuilder toWriteCopy = new StringBuilder();
        while ((stringFromFile = readerBuff.readLine()) != null) {
            //if (stringFromFile.contains(substring)) {
            newStringFromFile = stringFromFile.toLowerCase().replace(substring.toLowerCase(), replacementString);
            //System.out.println(newStringFromFile);
            //toWriteCopy = toWriteCopy + newStringFromFile + "\n";
            toWriteCopy.append(newStringFromFile).append("\n");
        }
        return toWriteCopy.toString();
    }
}
