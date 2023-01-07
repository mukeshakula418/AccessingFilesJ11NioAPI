package com.mukesh.AccessingFilesJ11NioAPI;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class WritingFiles {
    public static void main(String... args) {
        Path path = Path.of("files/debug.log");
        try (BufferedWriter writer1 = Files.newBufferedWriter(path);) {
            writer1.write("Hello world Mukesh! You're able to write to a file using NIO API");

            //created a second BufferedWriter2 by decorating writer1
            // This is very common practice in the Java IO API
            BufferedWriter writer2 =  new BufferedWriter(writer1);
            PrintWriter pw = new PrintWriter(writer2);
            pw.printf("\ni= %d\n", 12);
            pw.close();  //closing this flush method by hand will write the content

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("Done!");
    }
}
