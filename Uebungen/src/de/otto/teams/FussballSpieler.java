package de.otto.teams;

public class FussballSpieler extends MannschaftsSpieler {
	int geschosseneTore, fallrueckzieher, kopfbaelle;

	// Konstruktoren
	public FussballSpieler(String vorname, String nachname) { super(vorname, nachname); }

	public FussballSpieler(String vorname, String nachname, int rueckennummer) {
		super(vorname, nachname, rueckennummer);
	}

	// getter und setter
	public int getGeschosseneTore() { return geschosseneTore; }
	public void setGeschosseneTore(int geschosseneTore) { this.geschosseneTore = geschosseneTore; }
	public int getFallrueckzieher() { return fallrueckzieher; }
	public void setFallrueckzieher(int fallrueckzieher) { this.fallrueckzieher = fallrueckzieher; }
	public int getKopfbaelle() { return kopfbaelle; }
	public void setKopfbaelle(int kopfbaelle) { this.kopfbaelle = kopfbaelle; }

	// eigene Methoden
	public String toString() { return String.format("Fussballer %s", super.toString()); }
}
