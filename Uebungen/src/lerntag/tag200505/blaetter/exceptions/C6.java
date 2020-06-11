package lerntag.tag200505.blaetter.exceptions;
/*
 * Does compile succesfully? -> Y/N Y Y -> Executes succesfully? -> Y/N Y Y -> Is an exception thrown? -> Y/N N -> What is the output? N: 54321
 */

public class C6 {
	C6(int n) throws Throwable {}

	C6() throws Exception {}
}

class C61 extends C6 {
	C61() {
		super();
	}
}
