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
	
	public static List<String> getMovieRecom(Person p,int quantity) {
		RecombeeDBType dbName= RecombeeDBType.MOVIE_DB;
		return serviceInt.getRec4User(dbName, p, quantity);
	}

	public static List<String> getFoodRecom(Person p, int quantity) {
		RecombeeDBType dbName= RecombeeDBType.FOOD_DB;
		return serviceInt.getRec4User(dbName, p, quantity);
	}

	public static Person getPersonByU(String username) {
		return serviceInt.getUser(username);
	}
	
	public static List<FoodType> getFoodTypes() {
		return serviceInt.getFoodTypes();
//		List<String> l= new ArrayList<String>();
//		for(FoodType t:serviceInt.getFoodTypes()) {
//			l.add(t.value());
//		}
//		return l;
		
	}
	
	public static List<MovieGen> getMovieGens() {
		return serviceInt.getMovieGens();
//		List<String> l= new ArrayList<String>();
//		for(MovieGen t:serviceInt.getMovieGens()) {
//			l.add(t.value());
//		}
//		return l;
	}

	public static boolean addFoodRating(String foodName, Person p, double rating, Date timestemp){
		RecombeeDBType dbName= RecombeeDBType.FOOD_DB;
		return serviceInt.addNewRating(dbName, p, foodName, rating, DateToXML.GregorianCalendar(timestemp));
	}
	
	public static boolean addMovieRating(String movieName, Person p, double rating, Date timestemp) {
		RecombeeDBType dbName= RecombeeDBType.MOVIE_DB;
		return serviceInt.addNewRating(dbName, p, movieName, rating, DateToXML.GregorianCalendar(timestemp));
	}

	public static String addNewFood(String itemName, FoodType itemType, String location) {
		RecombeeDBType dbName= RecombeeDBType.FOOD_DB;
		return serviceInt.addNewItem(dbName, itemName, itemType.name(), location);
	}

	public static String addNewMovie(String itemName, MovieGen itemType, String location) {
		RecombeeDBType dbName= RecombeeDBType.MOVIE_DB;
		return serviceInt.addNewItem(dbName, itemName, itemType.name(), location);
	}

	public static Person updatePerson(Person person) {
		return serviceInt.updateUser(person);
	}

	public static boolean modifyFoodRating(String itemName, Person person, double rating, Date timestemp) {
		RecombeeDBType dbName= RecombeeDBType.FOOD_DB;
		return serviceInt.modifyRating(dbName, person, itemName, rating, DateToXML.GregorianCalendar(timestemp));
	}

	public static boolean modifyMovieRating(String itemName, Person person, double rating, Date timestemp) {
		RecombeeDBType dbName= RecombeeDBType.MOVIE_DB;
		return serviceInt.modifyRating(dbName, person, itemName, rating, DateToXML.GregorianCalendar(timestemp));
	}

	public static List<Evaluation> getFoodRatings(String itemName) {
		RecombeeDBType dbName= RecombeeDBType.FOOD_DB;
		return serviceInt.getItemRatings(dbName, itemName);
	}

	public static List<Evaluation> getMovieRatings(String itemName) {
		RecombeeDBType dbName= RecombeeDBType.MOVIE_DB;
		return serviceInt.getItemRatings(dbName, itemName);
	}

	public static List<Evaluation> getUserFoodRatings(Person person) {
		RecombeeDBType dbName= RecombeeDBType.FOOD_DB;
		return serviceInt.getUserRatings(dbName, person);
	}

	public static List<Evaluation> getUserMovieRatings(Person person) {
		RecombeeDBType dbName= RecombeeDBType.MOVIE_DB;
		return serviceInt.getUserRatings(dbName, person);
	}

	
}
