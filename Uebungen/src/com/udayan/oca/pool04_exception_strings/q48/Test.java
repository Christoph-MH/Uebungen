package com.udayan.oca.pool04_exception_strings.q48;

public class Test {
	public static void main(String[] args) {
		StringBuilder	sb	= new StringBuilder("Java");
		String			s1	= sb.toString();
		String			s2	= sb.toString();

		System.out.println(s1 == s2);
	}
}