package PJWSTK.Projekt;

import java.util.List;

public class PersonDB {

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

	
}
