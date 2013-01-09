package PJWSTK.Projekt;

import java.util.List;
import PJWSTK.Projekt.PetDB;
import PJWSTK.Projekt.PetInterface;

public class PetManager implements PetInterface {
	private Metody db = new Metody();

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
