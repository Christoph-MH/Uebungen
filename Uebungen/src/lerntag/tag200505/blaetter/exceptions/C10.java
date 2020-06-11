package lerntag.tag200505.blaetter.exceptions;

/*
 * Does compile succesfully? -> Y/N Y Y -> Executes succesfully? -> Y/N Y Y -> Is an exception thrown? -> Y/N Y: java.lang.RuntimeException N: What is
 * the output? N: c - from finally block
 * 
 */
public class C10 {
	void m1() throws IndexOutOfBoundsException {}

	void m2() throws RuntimeException {}

	void m3() {
		try {
			m1();
			m2();
		} catch (NumberFormatException | Error e) {}

	}
}
