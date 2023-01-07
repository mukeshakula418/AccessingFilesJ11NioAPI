package com.mukesh.AccessingFilesJ11NioAPI;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class WritingFiles {
    public static void main(String... args) {
        Path path = Path.of("files/debug.log");
        try (BufferedWriter writer1 = Files.newBufferedWriter(path);
             BufferedWriter writer2 =  new BufferedWriter(writer1);
             PrintWriter pw = new PrintWriter(writer2);) {

            writer1.write("Hello world Mukesh! You're able to write to a file using NIO API");

            pw.printf("\ni= %d\n", 12);
            pw.close();  //don't need to call the close method

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("Done!");
    }
}
