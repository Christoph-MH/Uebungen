package com.udayan.oca.pool04_exception_strings.q32;

public class Test extends String {
	@Override
	public String toString() {
		return "TEST";
	}

	public static void main(String[] args) {
		Test obj = new Test();
		System.out.println(obj);
	}
}