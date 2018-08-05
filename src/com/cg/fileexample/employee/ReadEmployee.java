/*
 * File input stream is used to read a file
 * This class exhibits the use of file input streams
 */
package com.cg.fileexample.employee;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEmployee {
	public static void main(String[] args) {

		FileInputStream fis;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(new File("EmployeeDetails.txt"));
			ois = new ObjectInputStream(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Reading each object from the file and displaying it
		Employee employee = null;
		try {
			while (ois.available() == 0) {
				employee = (Employee) ois.readObject(); 
				System.out.println(employee); 
			}
		} catch (EOFException e) {
			System.out.println("End of file");
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}