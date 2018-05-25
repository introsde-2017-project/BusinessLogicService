package introsde.project.business.soap;

import java.util.List;

import javax.jws.WebService;

import introsde.project.adopter.recombee.soap.Evaluation;
import introsde.project.adopter.recombee.soap.ItemObject;
import introsde.project.adopter.recombee.soap.RecombeeDBType;
import introsde.project.business.model.StorageService;
import introsde.project.data.local.soap.FoodType;
import introsde.project.data.local.soap.MovieGen;
import introsde.project.data.local.soap.Person;

@WebService(endpointInterface = "introsde.project.business.soap.BusinessInterface")
public class BusinessImpl implements BusinessInterface {

	public BusinessImpl(){
		//initalize the recombee DB
		StorageService.initDB(RecombeeDBType.FOOD_DB);
		StorageService.initDB(RecombeeDBType.MOVIE_DB);
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
		return StorageService.addNewItem(db,itemName, itemType, location);
	}

	@Override
	public boolean addNewRating(RecombeeDBType db, Evaluation rating) {
		return StorageService.addRating(db, rating);
	}

	@Override
	public boolean modifyRating(RecombeeDBType db, Evaluation rating) {
		return StorageService.modifyRating(db,rating);
	}

	@Override
	public List<Evaluation> getItemRatings(RecombeeDBType db, String itemName) {
		return StorageService.getItemRatings(db,itemName);
	}

	@Override
	public List<Evaluation> getUserRatings(RecombeeDBType db, Person person) {
		return StorageService.getUserRatings(db,person);
	}

	@Override
	public List<String> getRecommendations(RecombeeDBType db, Person person, int quantity) {	
		return StorageService.getRecom(db,person, quantity);
		
	}

	@Override
	public ItemObject getItem(RecombeeDBType db, String itemName) {
		return StorageService.getItem(db,itemName);
	}

	@Override
	public List<String> getAllItem(RecombeeDBType db) {
		return StorageService.getAllItem(db);
	}

	@Override
	public List<String> getItemsByType(RecombeeDBType db, String itemType) {
		return StorageService.getItemByType(db,itemType);
	}

	@Override
	public List<Person> getAllPerson() {
		return StorageService.getAllUser();
	}

	@Override
	public Person getPersonByToken(String token) {
		return StorageService.getPersonByToken(token);
	}
	
}
