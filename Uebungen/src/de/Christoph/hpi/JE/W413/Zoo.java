package de.Christoph.hpi.JE.W413;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {
	// Lege hier das Attribut tiere an:
	ArrayList<Papagei>      papageien = new ArrayList<>();
	ArrayList<Pinguin>      pinguine  = new ArrayList<>();
	HashMap<String, String> tiere     = new ArrayList<>();

	public Zoo() {
        Papagei alex = new Papagei();
        alex.setName("Alex");
        Papagei jaspar = new Papagei();
        jaspar.setName("Jaspar");
        Papagei kiki = new Papagei();
        kiki.setName("Kiki");
        Pinguin tux = new Pinguin();
        tux.setName("Tux");
        Pinguin nestor = new Pinguin();
        nestor.setName("Nestor");
        // Fuelle hier die Listen und die Map
        papageien.add(alex);
        papageien.add(jaspar);
        papageien.add(kiki);
        pinguine.add (tux);
        pinguine.add(nestor);
        tiere.put("")
                

    }

	public static void main(String args[]) {
		Zoo zoo = new Zoo();
		System.out.println("Im Zoo leben " + zoo.getTiere().size() + " Arten.");
		System.out.println("Es gibt " + zoo.getTiere().get("Pinguin").size() + " Pinguine");
		System.out.println("und " + zoo.getTiere().get("Papagei").size() + " Papageien.");
	}

	public HashMap<String, ArrayList<Object>> getTiere() { return tiere; }
}
