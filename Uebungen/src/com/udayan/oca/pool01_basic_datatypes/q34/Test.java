package com.udayan.oca.pool01_basic_datatypes.q34;

public class Test {
	public static void main(String[] args) {
		long	l	= 100_00l;
		int		i	= 100;
		float	f	= 2.02f;
		double	d	= 10_0.35d;
		f = l;
		d = l;
		f = d;
		d = f;
		f = i;
		i = f;
		i = (int) d;
	}
}