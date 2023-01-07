package com.mukesh.AccessingFilesJ11NioAPI;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WritingFiles {
    public static void main(String... args) {
        Path path = Path.of("files/debug.log");
        try (BufferedWriter writer = Files.newBufferedWriter(path);) {
            writer.write("Hello world Mukesh! You're able to write to a file using NIO API");

            writer.close();  // close method is calling a flush method itself which transfers what has been written
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("Done!");
    }
}
