package de.otto.teams;

public class MannschaftsSpieler extends Person {
	private int rueckennummer;
	private Mannschaft mannschaft;

	// Konstruktoren
	public MannschaftsSpieler(String vorname, String nachname) { super(vorname, nachname); }

	public MannschaftsSpieler(String vorname, String nachname, int rueckennummer) {
		super(vorname, nachname);
		this.rueckennummer = rueckennummer;
	}

	// getter und setter
	public int getRueckennummer() { return rueckennummer; }
	public void setRueckennummer(int rueckennummer) { this.rueckennummer = rueckennummer; }

	// eigene Methoden
	public void verlasseMannschaft() {
		if (mannschaft != null) {
			mannschaft.entlasseSpieler(this);
			mannschaft = null;
		}
	}

	public void betreteMannschaft(Mannschaft mannschaft) {
		if (mannschaft == null) {
			this.mannschaft = mannschaft;
			mannschaft.einstelleSpieler(this);
		}
	}

	public String toString() { return String.format("#%s: %s", rueckennummer, super.toString()); }
}


