package lerntag.tag200505.blaetter.exceptions;

/*
 * Does compile succesfully? -> Y/N Y Y -> Executes succesfully? -> Y/N N: no main() not executable
 * 
 * 
 * Y -> Is an exception thrown? -> Y/N N -> What is the output?
 */
class E71 extends Exception {
}

public class C7 {
	static {
		if (Math.random() > 0.5) { throw new E71(); }

	}

	C7() throws Exception {}
}

class C71 extends C7 {
	C71() throws Throwable {}
}
