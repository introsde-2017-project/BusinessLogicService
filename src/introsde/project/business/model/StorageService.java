package introsde.project.business.model;

import java.util.Date;
import java.util.List;

import introsde.project.adopter.recombee.soap.*;
import introsde.project.data.local.soap.*;
import introsde.project.storage.soap.*;

public class StorageService {
	private static StorageImplService serviceImp =  new StorageImplService();
	private static StorageInterface serviceInt = serviceImp.getStorageImplPort();
	
	public static Person addNewPerson(Person p) {
		return serviceInt.addNewUser(p);
	}

	public static Person getPersonByU(String username) {
		return serviceInt.getUser(username);
	}
	
	public static List<FoodType> getFoodTypes() {
		return serviceInt.getFoodTypes();
	}
	
	public static List<MovieGen> getMovieGens() {
		return serviceInt.getMovieGens();
	}


	public static Person updatePerson(Person person) {
		return serviceInt.updateUser(person);
	}

	public static String getItem(RecombeeDBType db, String itemName) {
		return serviceInt.getItem(db, itemName);
	}

	public static List<String> getRecom(RecombeeDBType db, Person person, int quantity) {
		return serviceInt.getRec4User(db, person, quantity);
	}

	public static String addNewItem(RecombeeDBType db, String itemName, String itemType, String location) {
		return serviceInt.addNewItem(db, itemName, itemType, location);
	}

	public static boolean addRating(RecombeeDBType db, String itemName, Person person, double rating, Date time) {
		return serviceInt.addNewRating(db, person, itemName, rating, DateToXML.GregorianCalendar(time));
	}

	public static boolean modifyRating(RecombeeDBType db, String itemName, Person person, double rating, Date time) {
		return serviceInt.modifyRating(db, person, itemName, rating, DateToXML.GregorianCalendar(time));
	}

	public static List<Evaluation> getItemRatings(RecombeeDBType db, String itemName) {
		return serviceInt.getItemRatings(db, itemName);
	}

	public static List<Evaluation> getUserRatings(RecombeeDBType db, Person person) {
		return serviceInt.getUserRatings(db, person);
	}

	
}
