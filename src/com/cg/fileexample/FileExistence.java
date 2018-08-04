/*
 * A program to take a file path as an input and determine whether the file exists or not
 * If the file is present at the location, it is checked if it's actually a file or a directory
 */
package com.cg.fileexample;

import java.io.File;
import java.util.Scanner;

public class FileExistence {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		// taking the file path from the user
		System.out.println("Enter the file path");
		String path = scanner.nextLine();

		File file = new File(path);
		// checking if the file exists
		// checking if the given file is a file and not a directory
		if (file.exists() && file.isFile()) {
			System.out.println("File exists and is is a file");
		} else
			System.out.println("File does not exists");
	}
}
