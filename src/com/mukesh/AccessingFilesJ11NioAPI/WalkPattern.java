package com.mukesh.AccessingFilesJ11NioAPI;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class WalkPattern {

	public static void main(String[] args) throws IOException {

		Path path = Path.of("files/media");

		boolean directory = Files.isDirectory(path);
		System.out.println("Directory = " + directory);
		
		Stream<Path> stream = Files.walk(path);
		
		long count = stream.count();
		
		long countDirs = 
			Files.walk(path)
				.filter(Files::isDirectory)
				.count();
		
		long countFiles = 
				Files.walk(path)
					.filter(Files::isRegularFile)
					.count();

		System.out.println("Count = " + count);
		System.out.println("Count dirs = " + countDirs);
		System.out.println("Count files = " + countFiles);
	}
}






