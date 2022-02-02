package com.ElementaryTasks.FilesParser;

import java.io.*;

public class MyFileReader {

    public void countString(String filePath, String substring) throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader(filePath));
        String stringLine;
        int i = 0;
        while ((stringLine = buffer.readLine()) != null) {
            if (stringLine.toLowerCase().contains(substring.toLowerCase())) {
                i = i + 1;
            }
        }
        if (i == 0) {
            System.out.println("I can`t find the string  \"" + substring + "\" in the text file");
        } else {
            System.out.println("Word \"" + substring + "\" occurs in the file: " + i + " times");
        }
    }

    public String replaceString(String filePath, String substring, String replacementString) throws IOException {
        BufferedReader readerBuff = new BufferedReader(new FileReader(filePath));
        String stringLine; //immutable
        String newStringLine; //immutable
        StringBuilder resultText = new StringBuilder(); //mutable
        while ((stringLine = readerBuff.readLine()) != null) {
            newStringLine = stringLine.toLowerCase().replace(substring.toLowerCase(), replacementString);
            resultText.append(newStringLine).append("\n");
        }
        return resultText.toString();
    }
}
