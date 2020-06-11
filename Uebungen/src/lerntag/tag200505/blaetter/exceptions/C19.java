package lerntag.tag200505.blaetter.exceptions;

/*
 * Does compile succesfully? -> Y/N
 * 
 * N: Unhandled exception type Throwable
 * 
 * would work like this: void m() throws Throwable {
 * 
 * Y -> Executes succesfully? -> Y/N Y -> Is an exception thrown? -> Y/N N -> What is the output?
 */
public class C19 {
	CharSequence s = "abc";

	void m() {
		s.append("def");
	}

	public static void main(String args[]) {
		C19 c19 = new C19();
		c19.m();
		System.out.println(c19.s);
	}
}
