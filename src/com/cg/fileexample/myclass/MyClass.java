/*
 * This class has some instance members defined in it
 * The test class uses input stream to read the values in the file
 * The same values are displayed on the console using the output stream
 */
package com.cg.fileexample.myclass;

import java.io.Serializable;

public class MyClass implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int value;

	//Creating a parameterized constructor for MyClass
	public MyClass(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}

	// Display details
	@Override
	public String toString() {
		return "MyClass with name = " + name + ", value = " + value + ".";
	}

}