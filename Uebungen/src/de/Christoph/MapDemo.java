package de.Christoph;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> namen = new HashMap<String, String>();
		// namen.put("Sloma", "C");
		// namen.put("Sloma", "H");
		// namen.put("Sloma", "Fa");
		// namen.put("Sloma", "Fe");
		// namen.put("Test", "P");
		// namen.put("Test", "H");
		// namen.put("Test", "T");
		System.out.println(namen);
		namen.put("C", "Sloma");
		namen.put("H", "Sloma");
		namen.put("Fa", "Sloma");
		namen.put("Fe", "Sloma");
		namen.put("P", "Test");
		namen.put("H", "Test");
		namen.put("T", "Test");
		namen.put("C", "Test");
		System.out.println(namen);
		System.out.println(namen.get("C"));
		System.out.println(namen.containsValue("Sloma"));
	}
}
