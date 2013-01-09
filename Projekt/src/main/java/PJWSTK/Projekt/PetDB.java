package PJWSTK.Projekt;

public class PetDB {

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

}
