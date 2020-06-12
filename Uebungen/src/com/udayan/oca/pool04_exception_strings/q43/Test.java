package com.udayan.oca.pool04_exception_strings.q43;

public class Test {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("SpaceStation");
		sb.delete(5, 6).insert(5, " S").toString().toUpperCase();
		System.out.println(sb);
	}
}