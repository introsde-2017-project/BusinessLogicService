package introsde.project.business.model;

import java.util.LinkedList;
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

//	public static ItemObject getItem(RecombeeDBType db, String itemName) {
//		return serviceInt.getItem(db, itemName);
//	}

	public static List<ItemObject> getRecom(RecombeeDBType db, Person person, int quantity) {
		return serviceInt.getRec4User(db, person, quantity);
	}

//	public static ItemObject addNewItem(RecombeeDBType db, String itemName, String itemType, String location) {
//		return serviceInt.addNewItem(db, itemName, itemType, location);
//	}

	public static boolean addRating(RecombeeDBType db, Evaluation rating) {
		return serviceInt.addNewRating(db, rating);
	}

//	public static boolean modifyRating(RecombeeDBType db, Evaluation rating) {
//		return serviceInt.modifyRating(db, rating);
//	}


	public static List<Evaluation> getUserRatings(RecombeeDBType db, Person person) {
		List<Evaluation> e= new LinkedList<Evaluation>();
		for(Evaluation ev:serviceInt.getUserRatings(db, person)) {
			System.out.println(ev.getItemId());
			double r=ev.getRating();
			ev.setRating((r*2)+3);
			e.add(ev);
		}
		return e;
	}

	public static boolean initDB(RecombeeDBType db) {
		return serviceInt.initDB(db);
	}

	//TODO add average ratings to each item object by use of get item rating
	public static List<ItemObject> getAllItem(RecombeeDBType db) {
		//serviceInt.getItemRatings(db, itemName);
		return serviceInt.getAllItem(db);
	}

	public static List<ItemObject> getItemByType(RecombeeDBType db, String itemType) {
		return serviceInt.getItemByType(db, itemType);
	}

	public static List<Person> getAllUser() {
		return serviceInt.getAllUser();
	}

	public static Person getPersonByToken(String token) {
		return serviceInt.getPersonByToken(token);
	}

	
}
