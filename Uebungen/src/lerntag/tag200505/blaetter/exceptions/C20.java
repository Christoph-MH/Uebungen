package lerntag.tag200505.blaetter.exceptions;
/*
 * Does compile succesfully? -> Y/N Y -> Executes succesfully? -> Y/N Y -> Is an exception thrown? -> Y/N N -> What is the output? N: blabla
 * 
 */

public class C20 {
	String s = "abc";

	void m() {
		s.concat("def");
	}

	public static void main(String args[]) {
		C20 c20 = new C20();
		c20.m();
		System.out.println(c20.s);
	}
}
