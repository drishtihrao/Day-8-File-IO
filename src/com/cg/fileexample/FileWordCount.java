/*
 * A program to calculate the number of words contained in a file
 */
package com.cg.fileexample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileWordCount {
	public static void main(String[] args) throws Exception {
		int wordCount = 0;
		String line;
		Scanner scanner = new Scanner(System.in);
		
		//taking the file path from the user
		System.out.println("Enter the file path");
		String path = scanner.nextLine();
		
		/*
		 * creating a list of words in the file
		 * each word is added as a new element in the list 
		 * calculating the length of the list
		 */
		BufferedReader reader = new BufferedReader(new FileReader(path));
		while((line = reader.readLine()) != null) {
			String wordList[] = line.split("\\s+");
			wordCount +=wordList.length;
		}
		reader.close();
		
		//Displaying the number of words in the file
		System.out.println("No. of wors is " + wordCount);	
	}
}
