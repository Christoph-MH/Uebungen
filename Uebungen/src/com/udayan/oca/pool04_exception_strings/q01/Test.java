package com.udayan.oca.pool04_exception_strings.q01;

class TestException extends Exception {
	public TestException() {
		super();
	}

	public TestException(String s) {
		super(s);
	}
}

public class Test {
	public void m1() throws __________ {
		throw new TestException();
	}
}