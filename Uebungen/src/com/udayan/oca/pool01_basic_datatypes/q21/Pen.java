package com.udayan.oca.pool01_basic_datatypes.q21;

public class Pen {
	public static void main(String[] args) {
		Pen	p1	= new Pen(); // Line 1
		Pen	p2	= new Pen(); // Line 2
		p1 = p2; // Line 3
		p1 = null; // Line 4
	}
}