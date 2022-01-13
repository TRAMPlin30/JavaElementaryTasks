package com.ElementaryTasks.FilesParser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {


    public void writeToFileReplacementString(String filePath, String result) throws IOException {

        BufferedWriter writerBuff = new BufferedWriter(new FileWriter(filePath));
        writerBuff.write(result);
        writerBuff.close();

    }
}
