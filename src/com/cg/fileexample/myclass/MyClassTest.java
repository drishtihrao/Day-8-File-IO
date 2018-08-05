/*
 * This class uses input stream to read the values in the file
 * The same values are displayed on the console using the output stream
 */
package com.cg.fileexample.myclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MyClassTest {
	public static void main(String[] args) throws ClassNotFoundException, IOException {

		ArrayList<MyClass> myClass = new ArrayList<>();

		//adding objects of MyClass to the array list
		myClass.add(new MyClass("DR", 9));
		myClass.add(new MyClass("PK", 10));
		myClass.add(new MyClass("PR", 29));
		myClass.add(new MyClass("KW", 27));
		myClass.add(new MyClass("VP", 15));

		//writing the array list in a file
		writeToFile(myClass, "MyClass.txt"); 
		//reading the file
		readFromFile("MyClass.txt"); 
	}

	private static void writeToFile(ArrayList<MyClass> myClass, String fileName) throws IOException {
		//Creating file output stream and object output stream objects
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//writing the array list in a file
		oos.writeObject(myClass); 
		//closing the output streams
		oos.close();
		fos.close();
	}

	private static void readFromFile(String fileName) throws ClassNotFoundException, IOException {
		//Creating file input stream and object input stream objects
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);

		//reading the array list from the file
		ArrayList<MyClass> myClass = (ArrayList<MyClass>) ois.readObject();
		//displaying the contents in the file
		myClass.stream().forEach((myclass) -> System.out.println(myclass));

	}

}