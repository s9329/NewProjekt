package PJWSTK.Projekt;


public class Application {
	public static void main(String[] args){
		/*Pet pet1 = new Pet("Hyourinmaru");
		Pet pet2 = new Pet("Senbonzakura");
		Person person1 = new Person("Dawid");
		pet1.addPetListener(person1);
		pet2.addPetListener(person1);*/	

		Person p1=new Person("nazwa");
		PersonDB db=new PersonDB("nazwa",1,1);
		db.addPerson(p1)


			}

		}
	}
}