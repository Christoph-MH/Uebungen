package com.udayan.oca.pool04_exception_strings.q14;

import java.io.*;

class ReadTheFile {
	static void print() { // Line 4
		throw new IOException(); // Line 5
	}
}

public class Test {
	public static void main(String[] args) { // Line 10
		ReadTheFile.print(); // Line 11
		// Line 12
	}
}