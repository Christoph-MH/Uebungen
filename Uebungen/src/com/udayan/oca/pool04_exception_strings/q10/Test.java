package com.udayan.oca.pool04_exception_strings.q10;

public class Test {
	private static String s;

	public static void main(String[] args) {
		try {
			System.out.println(s.length());
		} catch (NullPointerException | RuntimeException ex) {
			System.out.println("DONE");
		}
	}
}