package lerntag.tag200505.blaetter.exceptions;

/*
	Does compile succesfully? -> Y/N
	
		N: 	This method must return a result of type int
			return 12345;
			
				- return type is missing in signature of method C5.m()
		
		Y -> Executes succesfully? -> Y/N
			Y -> Is an exception thrown? -> Y/N
				N -> What is the output?
*/
public class C5 {
	
	int m() {
		
		try {
			int n = "abc".charAt('d');
			return 12345;
		}
		catch (IndexOutOfBoundsException e) {
		}
	}
}