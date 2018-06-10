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


	public static List<ItemObject> getRecom(RecombeeDBType db, Person person, int quantity) {
		return serviceInt.getRec4User(db, person, quantity);
	}


	public static boolean addRating(RecombeeDBType db, Evaluation rating) {
		return serviceInt.addNewRating(db, rating);
	}


	public static List<Evaluation> getUserRatings(RecombeeDBType db, Person person) {
		List<Evaluation> e= new LinkedList<Evaluation>();
		for(Evaluation ev:serviceInt.getUserRatings(db, person)) {
			//System.out.println(ev.getItemId());
			double r=ev.getRating();
			ev.setRating(round((r*2)+3,2));
			e.add(ev);
		}
		return e;
	}

	public static boolean initDB(RecombeeDBType db) {
		return serviceInt.initDB(db);
	}

	public static List<ItemObject> getAllItem(RecombeeDBType db) {
		List<ItemObject> i= new LinkedList<ItemObject>();
		for(ItemObject item: serviceInt.getAllItem(db)) {
			double r=item.getAvgRating();
			item.setAvgRating(round((r*2)+3,2));
			i.add(item);
		}
		return i;
	}

	public static List<ItemObject> getItemByType(RecombeeDBType db, String itemType) {
		return serviceInt.getItemByType(db, itemType);
	}

	public static Person getPersonByToken(String token) {
		return serviceInt.getPersonByToken(token);
	}

	private static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
}
