package com.udayan.oca.pool04_exception_strings.q51;

class SpecialString {
	String str;

	SpecialString(String str) {
		this.str = str;
	}
}

public class Test {
	public static void main(String[] args) {
		System.out.println(new String("Java"));
		System.out.println(new StringBuilder("Java"));
		System.out.println(new SpecialString("Java"));
	}
}