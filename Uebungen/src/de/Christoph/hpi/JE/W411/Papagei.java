package de.Christoph.hpi.JE.W411;

public class Papagei {
	String name = "";

	public void setName(String name) { this.name = name; }

	public String gibSatz() {
		return "Hallo, ich bin " + name;
	}
}
