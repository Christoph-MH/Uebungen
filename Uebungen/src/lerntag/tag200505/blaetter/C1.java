package lerntag.tag200505.blaetter;

class C3 {
	void m() {
		try {
			int i = Integer.parseInt("blabla");
		} catch (RuntimeException | IllegalArgumentException e) {}
	}
}

class C101 {
	void C101() throws Exception {}
}

public class C1 extends C101 {
	public static void main(String[] args) {
		try {
			int n = "abc".charAt('d');
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

	@Override
	void C101() throws Exception {
		// TODO Auto-generated method stub
		super.C101();
	}
}

class C4 {
	void m() {
		try {
			int i = Integer.parseInt("blabla");
		} catch (IllegalArgumentException | IndexOutOfBoundsException e) {
			e = new RuntimeException();
		}
	}
}
