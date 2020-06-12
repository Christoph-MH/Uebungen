package com.udayan.oca.pool04_exception_strings.q38;

public class Test {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hurrah! I Passed...");
		sb.delete(0, 100);
		System.out.println(sb.length());
	}
}