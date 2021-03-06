package de.whohm;

public class Person {
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName  = lastName;
	}

	public String getFirstName() { return firstName; }

	public String getLastName() { return lastName; }

	// mit settern die
	public void setFirstName(String firstName) { this.firstName = firstName; }

	public void setLastName(String lastName) { this.lastName = lastName; }

	public Person buildPerson() {
		return new Person("Mein Gott ", "Walter");
	}

	public Person buildPerson2() {
		Person person = new Person("Peter", "Lustig");
		return person;
	}
}
