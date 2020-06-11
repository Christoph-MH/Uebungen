package lerntag.tag200505.blaetter.exceptions;

import java.io.FileNotFoundException;

/*
 * Does compile succesfully? -> Y/N
 * 
 * N: public void m() throws IOException { Multiple markers at this line - Exception IOException is not compatible with throws clause in I81.m() -
 * implements wbs.selbstlerntag.exceptions_uebungen_1.I80.m
 * 
 * same method name (throwing different exceptions) in 2 interfaces IOException is parent class of FileNotFoundException
 * 
 * 
 * Y -> Executes succesfully? -> Y/N Y -> Is an exception thrown? -> Y/N N -> What is the output?
 */
public class C8 {
	{
		if (Math.random() > 0.5) { throw new FileNotFoundException(); }

	}

	C8() {}
}

class C81 extends C8 {
	C81() throws Throwable {}
}
