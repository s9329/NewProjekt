package PJWSTK.Projekt;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Metody {
	Connection connection;
	Statement statement;
	ResultSet rs;
	PreparedStatement addPerson;
	PreparedStatement getAll;
	PreparedStatement removePerson;
	PreparedStatement addPet;
	PreparedStatement removePet;
	PreparedStatement getAll2;
	PreparedStatement removeAllPets;

	public Metody() {
		try {
			connection = DriverManager
					.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
			statement = connection.createStatement();
			rs = connection.getMetaData().getTables(null, null, null, null);

			addPerson = connection
					.prepareStatement("insert into Person(name,ID,Pets,)"
							+ "VALUES (?,?,?);");
			removePerson = connection
					.prepareStatement("delete from Person where name=?");
			getAll = connection.prepareStatement("select * from Person");
			addPet = connection.prepareStatement("insert into Pet(name,ID)"
					+ "values (?,?)");
			removePet = connection
					.prepareStatement("delete from Pet where name=?");
			getAll2 = connection.prepareStatement("select * from Pet");
			removeAllPets = connection
					.prepareStatement("update Person SET Pets=0 WHERE name=?");
		} catch (SQLException e) {

		}
	}

	public boolean addPerson(PersonDB obj) {
		try {
			addPerson.setString(1, obj.getName());
			addPerson.setInt(2, obj.getID());
			addPerson.setInt(3, obj.getPets());

			return addPerson.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean addPet(PetDB obj) {
		try {
			addPet.setString(1, obj.getName());
			addPet.setInt(2, obj.getID());

			return addPet.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean removePerson(PersonDB obj) {
		try {
			removePerson.setString(1, obj.getName());

			return removePerson.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean removePet(PetDB obj) {
		try {
			addPet.setString(1, obj.getName());

			return removePet.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<PersonDB> getAll() {
		ArrayList<PersonDB> result = new ArrayList<PersonDB>();
		try {
			ResultSet rs = getAll.executeQuery();
			while (rs.next()) {
				PersonDB p = new PersonDB(rs.getString("name"),
						rs.getInt("ID"), rs.getInt("Pets"));
				result.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public List<PetDB> getAll2() {
		ArrayList<PetDB> result = new ArrayList<PetDB>();
		try {
			ResultSet rs = getAll2.executeQuery();
			while (rs.next()) {
				PetDB p = new PetDB(rs.getString("name"), rs.getInt("ID"));
				result.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean removeAllPets(PersonDB obj) {
		try {
			removeAllPets.setString(1, obj.getName());
			return removeAllPets.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
