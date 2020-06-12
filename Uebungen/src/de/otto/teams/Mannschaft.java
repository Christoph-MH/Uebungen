package de.otto.teams;

import java.util.List;
import java.util.ArrayList;

public class Mannschaft {
	String name;
	List<MannschaftsSpieler> mitglieder = new ArrayList<>();

	// Konstruktoren
	public Mannschaft(String name) {
		super();
		this.name = name;
	}

	// getter und setter
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public List<MannschaftsSpieler> getMitglieder() { return mitglieder; }
	public void setMitglieder(List<MannschaftsSpieler> mitglieder) { this.mitglieder = mitglieder; }

	// eigene Methoden
	public void entlasseSpieler(MannschaftsSpieler mitglied) {
		if (mitglieder.contains(mitglied)) {
			mitglieder.remove(mitglied);
			mitglied.verlasseMannschaft();
		}
	}

	public void einstelleSpieler(MannschaftsSpieler mitglied) {
		if (!mitglieder.contains(mitglied)) {
			mitglieder.add(mitglied);
			mitglied.betreteMannschaft(this);
		}
	}

	public String toString() { return this.name; }
}
