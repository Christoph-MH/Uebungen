package com.udayan.oca.pool04_exception_strings.q16;

public class Test {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		try {
			for (;;) {
				sb.append("OCA");
			}
		} catch (Exception e) {
			System.out.println("Exception!!!");
		}
		System.out.println("Main ends!!!");
	}
}