package de.whohm;

public class PersonDemo
{
	public static void main(String[] args)
	{
		Person person = new Person("Otto", "Walkes");
		// Person person = new Person(); // Comp.Fehler, da nicht mehr default const.
		System.out.print(person.getFirstName() + " ");
		System.out.println(person.getLastName());
		person.setFirstName("Willibald"); // mit setter lässt sich das immutable ändern
		System.out.print(person.getFirstName() + " ");
		System.out.println(person.getLastName());
	}
}
