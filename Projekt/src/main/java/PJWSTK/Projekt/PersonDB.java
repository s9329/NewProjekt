package PJWSTK.Projekt;
import java.util.List;

import PJWSTK.Projekt.DBmanager;

public class PersonDB implements PersonInterface{

	private String name;
	private int ID;
	private int Pets;
	

	DBmanager db=DBmanager.getInstance();

	public PersonDB(String name, int ID, int Pets){
		this.name=name;
		this.ID=ID;
		this.Pets=Pets;
		

	}

//get
public String getName() {
	return name;
}

public int getID() {
	return ID;
}

public int getPets() {
	return Pets;
}



//metody
public boolean addPerson(PersonDB obj) {
	return db.addPerson(obj);
}

public void removePerson() {

}
public List<PersonInterface> getAll() {

	return null;
}



	
}


