package com.udayan.oca.pool01_basic_datatypes.q36;

public class Test {
	public static void main(String[] args) {
		String[] arr = { "abc", "TrUe", "false", null, "FALSE" };
		for (String s : arr) {
			System.out.print(Boolean.valueOf(s) ? "T" : "F");
		}
	}
}