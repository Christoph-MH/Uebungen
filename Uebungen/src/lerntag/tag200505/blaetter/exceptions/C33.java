package lerntag.tag200505.blaetter.exceptions;

class C33 {
	static String s = new Object().toString();

	public static void main(String[] args) {
		System.out.println(s instanceof String);
	}

	static {
		s = s.getClass().getName();
	}
}
