package com.udayan.oca.pool04_exception_strings.q47;

public class Test {
	public static void main(String[] args) {
		String			str	= "java";
		StringBuilder	sb	= new StringBuilder("java");

		System.out.println(str.equals(sb) + ":" + sb.equals(str));
	}
}
