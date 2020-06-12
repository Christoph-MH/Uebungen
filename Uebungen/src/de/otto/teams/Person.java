package de.otto.teams;

public class Person {
	private String vorname, nachname;

	// Konstruktor
	public Person(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}

	// getter und setter
	public String getVorname() { return vorname; }
	public void setVorname(String vorname) { this.vorname = vorname; }
	public String getNachname() { return nachname; }
	public void setNachname(String nachname) { this.nachname = nachname; }

	@Override
	public String toString() {
		return String.format("%s %s", vorname, nachname);
	}
}

