package PJWSTK.Projekt;

import java.util.List;

public interface PetInterface {
	boolean addPet(PetDB obj);

	boolean removePet(PetDB obj);

	List<PetDB> getAll2();

}
