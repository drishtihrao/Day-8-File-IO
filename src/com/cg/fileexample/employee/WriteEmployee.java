/*
 * File output stream is used to write in a file
 * This class exhibits the use of file output streams
 */
package com.cg.fileexample.employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmployee {
	public static void main(String[] args) {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("EmployeeDetails.txt");
			oos = new ObjectOutputStream(fos);

			oos.writeObject(new Employee("PK", 10, 50_000)); // Writing employee objects to the file
			oos.writeObject(new Employee("VP", 9, 60_000));
			oos.writeObject(new Employee("AP", 27, 40_000));
			oos.writeObject(new Employee("HM", 7, 80_000));
			//closing the output streams
			oos.close();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}