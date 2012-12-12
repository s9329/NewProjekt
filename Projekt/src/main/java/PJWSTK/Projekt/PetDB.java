package PJWSTK.Projekt;

import java.util.List;

public class PetDB implements PetInterface {

	private Metody db = new Metody();
	private String name;
	private int ID;

	public PetDB(String name, int ID) {
		this.name = name;
		this.ID = ID;

	}

	// get
	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}

	public String toString() {

		return "Pets name:" + name + " ID:" + ID;
	}

	public boolean addPet(PetDB obj) {
		return db.addPet(obj);
	}

	public boolean removePet(PetDB obj) {
		return db.removePet(obj);
	}

	public List<PetDB> getAll2() {

		return db.getAll2();
	}
}
