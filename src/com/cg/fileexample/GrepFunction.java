/*
 * Grep function is useful utility in Unix
 * It is used to list the lines in the text file that contains a certain string
 * This class implements the grep function
 */
package com.cg.fileexample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrepFunction {

	public static void main(String[] args) throws IOException {
		int lineCount = 0, flag = 0;
		String line;

		Pattern pattern = Pattern.compile(args[1]);
		Matcher matcher = pattern.matcher(" ");

		//The input string from the command line is searched in the text file
		//When a match is found, the Class displays the line number and the line in which the certain string is present
		BufferedReader reader = new BufferedReader(new FileReader(args[0]));
		while ((line = reader.readLine()) != null) {
			matcher.reset(line);
			lineCount++;
			if (matcher.find()) {
				flag = 1;
				System.out.println("Line number " + lineCount + " Line: " + line);
			}
		}
		if (flag == 0)
			System.out.println("String is not present");
		reader.close();
	}
}
