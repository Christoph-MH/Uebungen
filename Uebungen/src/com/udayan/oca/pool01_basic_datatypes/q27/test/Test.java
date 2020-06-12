package com.udayan.oca.pool01_basic_datatypes.q27.test;

import java.util.Random;

import com.udayan.oca.pool01_basic_datatypes.q27.Counter;

public class Test {
	public static void main(String[] args) {
		Random	random	= new Random();
		int		num		= random.nextInt(51);
		Counter	counter	= new Counter(num);

		/* INSERT */
		//counter.count = 10;
		//counter.change(-counter.getCount()+10);
		counter.change(10 - counter.getCount());
		
		System.out.println(counter.getCount());
	}
}