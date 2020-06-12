package com.udayan.oca.pool04_exception_strings.q11;

class Base {
	public void m1() throws NullPointerException {
		System.out.println("Base: m1()");
	}
}

class Derived extends Base {
	public void m1() throws RuntimeException {
		System.out.println("Derived: m1()");
	}
}

public class Test {
	public static void main(String[] args) {
		Base obj = new Derived();
		obj.m1();
	}
}