package com.udayan.oca.pool01_basic_datatypes.q22;

class Pen {

}

public class TestPen {
	public static void main(String[] args) {
		new Pen(); // Line 1
		Pen p = new Pen(); // Line 2
		change(p); // Line 3
		System.out.println("About to end."); // Line 4
	}

	public static void change(Pen pen) { // Line 5
		pen = new Pen(); // Line 6
	}
}
