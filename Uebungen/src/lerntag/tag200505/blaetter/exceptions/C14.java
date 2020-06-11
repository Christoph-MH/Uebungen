package lerntag.tag200505.blaetter.exceptions;

/*
 * Does compile succesfully? -> Y/N Y Y -> Executes succesfully? -> Y/N Y Y -> Is an exception thrown? -> Y/N N -> What is the output? N: cba -
 * finally block is not executed
 */
public class C14 {
	static StringBuffer sb = new StringBuffer();
	{
		sb.append("a");
	}
	{
		sb.append("b");
	}

	C14() {
		sb.append("c");
		throw new RuntimeException();
	}

	static {
		sb.append("d");
	}

	C14(int n) {
		this();
		sb.append(1);
	}

	public String toString() {
		return sb.toString();
	}

	public static void main(String... strings) {
		System.out.println(new C14((int) Math.PI));
	}
}
