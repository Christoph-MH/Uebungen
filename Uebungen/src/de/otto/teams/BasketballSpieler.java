package de.otto.teams;

public class BasketballSpieler extends MannschaftsSpieler {
	int erzielte1erWuerfe, erzielte2erWuerfe, erzielte3erWuerfe;

	// Konstruktoren
	public BasketballSpieler(String vorname, String nachname) { super(vorname, nachname); }

	public BasketballSpieler(String vorname, String nachname, int rueckennummer) {
		super(vorname, nachname, rueckennummer);
	}
	
	// getter und setter
	public int getErzielte1erWuerfe() { return erzielte1erWuerfe; }
	public void setErzielte1erWuerfe(int erzielte1erWuerfe) { this.erzielte1erWuerfe = erzielte1erWuerfe; }
	public int getErzielte2erWuerfe() { return erzielte2erWuerfe; }
	public void setErzielte2erWuerfe(int erzielte2erWuerfe) { this.erzielte2erWuerfe = erzielte2erWuerfe; }
	public int getErzielte3erWuerfe() { return erzielte3erWuerfe; }
	public void setErzielte3erWuerfe(int erzielte3erWuerfe) { this.erzielte3erWuerfe = erzielte3erWuerfe; }

	// eigene Methoden
	public String toString() {
		return String.format("Basketballer %s", super.toString());
	}
}
