package introsde.project.business.soap;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import introsde.project.adopter.recombee.soap.Evaluation;
import introsde.project.adopter.recombee.soap.RecombeeDBType;
import introsde.project.business.model.StorageService;
import introsde.project.data.local.soap.FoodType;
import introsde.project.data.local.soap.MovieGen;
import introsde.project.data.local.soap.Person;

@WebService(endpointInterface = "introsde.project.business.soap.BusinessInterface")
public class BusinessImpl implements BusinessInterface {

	public BusinessImpl(){
		
	}

	@Override
	public Person addNewPerson(Person person) {
		return StorageService.addNewPerson(person);
	}

	@Override
	public Person getPerson(String username) {
		return StorageService.getPersonByU(username);
	}

	@Override
	public Person updatePerson(Person person) {
		return StorageService.updatePerson(person);
	}

	@Override
	public List<FoodType> getFoodTypes() {
		return StorageService.getFoodTypes();
	}

	@Override
	public List<MovieGen> getMovieGens() {
		return StorageService.getMovieGens();
	}

	@Override
	public String addNewItem(RecombeeDBType db, String itemName, String itemType, String location) {
		if(db.equals(RecombeeDBType.FOOD_DB)) {
			return StorageService.addNewFood(itemName, FoodType.fromValue(itemType), location);
		}
		else {
			return StorageService.addNewMovie(itemName, MovieGen.fromValue(itemType), location);
		}
		
	}

	@Override
	public boolean addNewRating(RecombeeDBType db, Person person, String itemName, double rating, Date time) {
		if(db.equals(RecombeeDBType.FOOD_DB)) {
			return StorageService.addFoodRating(itemName, person, rating, time);
		}
		else {
			return StorageService.addMovieRating(itemName, person, rating, time);
		}
	}

	@Override
	public boolean modifyRating(RecombeeDBType db, Person person, String itemName, double rating, Date time) {
		if(db.equals(RecombeeDBType.FOOD_DB)) {
			return StorageService.modifyFoodRating(itemName, person, rating, time);
		}
		else {
			return StorageService.modifyMovieRating(itemName, person, rating, time);
		}
	}

	@Override
	public List<Evaluation> getItemRatings(RecombeeDBType db, String itemName) {
		if(db.equals(RecombeeDBType.FOOD_DB)) {
			return StorageService.getFoodRatings(itemName);
		}
		else {
			return StorageService.getMovieRatings(itemName);
		}
	}

	@Override
	public List<Evaluation> getUserRatings(RecombeeDBType db, Person person) {
		if(db.equals(RecombeeDBType.FOOD_DB)) {
			return StorageService.getUserFoodRatings(person);
		}
		else {
			return StorageService.getUserMovieRatings(person);
		}
	}

	@Override
	public List<String> getRecommendations(RecombeeDBType db, Person person, int quantity) {
		if(db.equals(RecombeeDBType.FOOD_DB)) {
			return StorageService.getFoodRecom(person, quantity);
		}
		else {
			return StorageService.getMovieRecom(person, quantity);
		}
	}
	
}
