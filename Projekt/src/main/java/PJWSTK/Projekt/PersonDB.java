package PJWSTK.Projekt;

import java.util.List;

public class PersonDB implements PersonInterface {

	private String name;
	private int ID;
	private int Pets;

	private Metody db = new Metody();

	public PersonDB(String name, int ID, int Pets) {
		this.name = name;
		this.ID = ID;
		this.Pets = Pets;

	}

	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}

	public int getPets() {
		return Pets;
	}

	public String toString() {

		return "Persons name:" + name + " ID:" + ID + " Pets:" + Pets;
	}

	public boolean addPerson(PersonDB obj) {
		return db.addPerson(obj);
	}

	public boolean removePerson(PersonDB obj) {
		return db.removePerson(obj);
	}

	public boolean removeAllPets(PersonDB obj) {
		return db.removeAllPets(obj);
	}

	public List<PersonDB> getAll() {

		return db.getAll();
	}

}
