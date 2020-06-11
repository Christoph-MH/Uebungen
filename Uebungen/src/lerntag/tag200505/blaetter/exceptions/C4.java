package lerntag.tag200505.blaetter.exceptions;

/*
	Does compile succesfully? -> Y/N
	
		N: 	The parameter e of a multi-catch block cannot be assigned
		
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?	
*/

public class C4 {
	
	void m() {
		
		try {
			int i = Integer.parseInt("blabla");
		}
		catch (IllegalArgumentException | IndexOutOfBoundsException e) {
			e = new RuntimeException();
		}
	}
}
