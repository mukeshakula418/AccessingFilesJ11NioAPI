package com.mukesh.AccessingFilesJ11NioAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingFiles {
    public static void main(String[] args) {
        Path path = Path.of("files/sonnet-ISO.txt");

        boolean exists = Files.exists(path);
        System.out.println("Exists = " + exists);
        // try with resource - guaranteed to close the reader when try blocks is exited
        // ISO_8859_1 is passed a second parameter to resolve issue with reading special char
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1);){
            String line = reader.readLine();
            while(line != null) {
                System.out.println("Line = " + line);
                line = reader.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
