package de.otto.teams;

public class TeamDemo {

	public static void main(String[] args) {
		MannschaftsSpieler spieler1 = new MannschaftsSpieler("Jens","Richter", 2);
		FussballSpieler fussballer1 = new FussballSpieler("Christoph", "Sloma", 3);
		BasketballSpieler basketballer1 = new BasketballSpieler("Christian", "Malter", 4);

		// Erstelle eine Mannschafft und f�ge vorhandene Spieler hinzu
		Mannschaft sportmannschaft = new Mannschaft("Allgemeiner Sportverein Pinguin");
		sportmannschaft.einstelleSpieler(spieler1);
		sportmannschaft.einstelleSpieler(fussballer1);
		sportmannschaft.einstelleSpieler(basketballer1);
//		mannschaft1.einstelleSpieler(person1);				
		
		System.out.println(sportmannschaft);
		sportmannschaft.getMitglieder().forEach(System.out::println);
		System.out.println();

		// Erstelle eine Fussballmannschaft und f�ge neue und alte Spieler hinzu 

		Mannschaft fussballmannschaft = new Mannschaft("1.FC Brillenpinguin");
		sportmannschaft.entlasseSpieler(fussballer1);
		fussballmannschaft.einstelleSpieler(fussballer1);
		fussballmannschaft.einstelleSpieler(new FussballSpieler("Walter","Hohm",5));
		fussballmannschaft.einstelleSpieler(new FussballSpieler("Naoufel","Boukarma",6));
		
		System.out.println(fussballmannschaft);
		fussballmannschaft.getMitglieder().forEach(System.out::println);
		System.out.println();
		
		// Erstelle eine Basketallmannschaft und f�ge neue und alte Spieler hinzu 

		Mannschaft basketallmannschaft = new Mannschaft("SV Kaiserpinguin");
		sportmannschaft.entlasseSpieler(basketballer1);
		basketallmannschaft.einstelleSpieler(basketballer1);
		basketallmannschaft.einstelleSpieler(new BasketballSpieler("Arafat","Khan",7));
		basketallmannschaft.einstelleSpieler(new BasketballSpieler("J�rgen","Fischer",8));
		
		System.out.println(basketallmannschaft);
		basketallmannschaft.getMitglieder().forEach(System.out::println);
		System.out.println();
		
		
		// Und was macht der alte Verein?
		System.out.println(sportmannschaft);
		sportmannschaft.getMitglieder().forEach(System.out::println);
		System.out.println();
		
	}

}
