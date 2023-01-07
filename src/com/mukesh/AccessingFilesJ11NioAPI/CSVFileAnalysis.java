package com.mukesh.AccessingFilesJ11NioAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Function;

public class CSVFileAnalysis {

    public static void main(String[] args){
        Path path = Path.of("files/data.csv");

        Function<String, Person> lineToPerson = line -> lineToPerson(line);

        try (BufferedReader reader = Files.newBufferedReader(path)){
            String line = reader.readLine();
            while (line != null) {
                if (!line.startsWith("#")){
                    Person person = lineToPerson.apply(line);
                    System.out.println("person = "+ person);
                }
                line = reader.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static Person lineToPerson(String line) {
        String[] elements = line.split(";");
        String name = elements[0];
        int age = Integer.parseInt(elements[1]);
        String city = elements[2];

        Person p = new Person(name, age, city);
        return p;
    }
}
