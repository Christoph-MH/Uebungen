package lerntag.tag200505.blaetter.exceptions;

/*
 * Does compile succesfully? -> Y/N Y Y -> Executes succesfully? -> Y/N N: no main() not executable
 * 
 * Y -> Is an exception thrown? -> Y/N N -> What is the output?
 */
public class C9 {
	void m1() throws IndexOutOfBoundsException {}

	void m2() throws RuntimeException {}

	void m3() {
		try {
			m1();
			m2();
		} catch (NumberFormatException e) {}

	}
}
