package PJWSTK.Projekt;


public class Person implements PetListener {
	private String name;
	public Person(String name){
		this.name = name;
	}
	public void petHungry(PetEvent e) {
		System.out.println("-" + name + " feeds " + e.getSource().getName());	

	}
	public void petThirsty(PetEvent e) {
		System.out.println("-" + name + " lays down a bowl of water " + e.getSource().getName());	

	}

	public void petLonely(PetEvent e) {
		System.out.println("-" + name + " plays with " + e.getSource().getName() + " for a while. ");

	}

	public void petSleeps(PetEvent e) {
		System.out.println("-" + name + " pets " + e.getSource().getName());

	}

}