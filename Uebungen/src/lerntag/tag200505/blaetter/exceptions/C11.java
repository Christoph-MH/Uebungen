package lerntag.tag200505.blaetter.exceptions;

public class C11 {
	void m1() throws IndexOutOfBoundsException {}

	void m2() throws Exception {}

	void m3() {
		try {
			m1();
			m2();
		} catch (Throwable e) {}

	}
}
