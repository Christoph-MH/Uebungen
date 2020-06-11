package lerntag.tag200505.blaetter.exceptions;

class C381 {
	int n = 1;
}

public class C38 extends C381 {
	int n = 2;

	public static void main(String[] args) {
		C381 c381 = new C381();
		int  n    = c381.n + ((C381) c381).n;
		System.out.println(n);
	}
}
