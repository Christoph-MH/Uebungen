package lerntag.tag200505.blaetter.exceptions;

class C34 {
	static CharSequence s = "abc";

	public static void main(String[] args) {
		System.out.println(s instanceof String);
	}

	static {
		s = s.getClass().getName();
	}
}
