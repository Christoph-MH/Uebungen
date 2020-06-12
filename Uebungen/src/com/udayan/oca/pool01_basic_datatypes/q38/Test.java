package com.udayan.oca.pool01_basic_datatypes.q38;

public class Test {
	public static void main(String[] args) {
		extractInt(2.7);
		extractInt(2);
	}

	private static void extractInt(Double obj) {
		System.out.println(obj.intValue());
	}
}