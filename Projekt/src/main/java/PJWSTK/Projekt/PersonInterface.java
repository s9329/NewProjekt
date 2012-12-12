package PJWSTK.Projekt;

import java.util.List;

public interface PersonInterface {

	boolean addPerson(PersonDB obj);

	boolean removePerson(PersonDB obj);
	
	boolean removeAllPets(PersonDB obj);

	List<PersonDB> getAll();
	
	

}
