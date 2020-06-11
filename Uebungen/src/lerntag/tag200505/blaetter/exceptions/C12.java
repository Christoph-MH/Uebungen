package lerntag.tag200505.blaetter.exceptions;

/*
 * Does compile succesfully? -> Y/N
 * 
 * N: SQLException checked exception, IllegalArgumentException unchecked exception
 * 
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: Unhandled exception type Exception
 * 
 * at wbs.selbstlerntag.exceptions_uebungen_1.C12.main(C12.java:17)
 * 
 * ... this would work: public static void main(String[] args) throws Exception {
 * 
 * 
 * Y -> Executes succesfully? -> Y/N Y -> Is an exception thrown? -> Y/N N -> What is the output?
 */
public class C12 {
	static String s;
	static {
		s = "lalla";
	}
}
