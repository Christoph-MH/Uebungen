package com.udayan.oca.pool04_exception_strings.q06;

public class Test {
	private static void m1() {
		System.out.println(1 / 0);
	}

	public static void main(String[] args) {
		try {
			m1();
		} finally {
			System.out.println("A");
		}
	}
}