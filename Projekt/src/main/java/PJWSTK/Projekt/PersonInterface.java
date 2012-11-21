package PJWSTK.Projekt;

import java.util.List;

public interface PersonInterface {

	boolean addPerson (PersonDB obj);
	void removePerson();
	List<PersonInterface> getAll();
	

}
