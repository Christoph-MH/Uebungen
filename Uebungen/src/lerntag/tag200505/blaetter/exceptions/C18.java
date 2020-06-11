package lerntag.tag200505.blaetter.exceptions;

/*
 * Does compile succesfully? -> Y/N Y Y -> Executes succesfully? -> Y/N Y Y -> Is an exception thrown? -> Y/N Y:
 * 
 * Exception in thread "main" java.lang.IndexOutOfBoundsException at wbs.selbstlerntag.exceptions_uebungen_1.C18.m(C18.java:31) at
 * wbs.selbstlerntag.exceptions_uebungen_1.C18.main(C18.java:40)
 */
import java.util.Arrays;

public class C18 {
	int m1(Iterable<Integer> c) {
		return 1;
	}

	void m2() {
		m1(Arrays.asList(Integer.valueOf(1)));
	}
}
