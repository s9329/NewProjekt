package PJWSTK.Projekt;

import java.util.List;
import PJWSTK.Projekt.PersonDB;
import PJWSTK.Projekt.PersonInterface;

public class PersonManager implements PersonInterface{


private Metody db = new Metody();

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