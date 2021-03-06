package introsde.project.business.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import introsde.project.adopter.recombee.soap.Evaluation;
import introsde.project.adopter.recombee.soap.ItemObject;
import introsde.project.adopter.recombee.soap.RecombeeDBType;
import introsde.project.data.local.soap.FoodType;
import introsde.project.data.local.soap.MovieGen;
import introsde.project.data.local.soap.Person;


@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public interface BusinessInterface {
	
	////////local DB
	
	
	@WebMethod(operationName="addNewUser")
    @WebResult(name="Person") 
	public Person addNewPerson(
			@WebParam(name="person") Person person
			);
	@WebMethod(operationName="getUser")
    @WebResult(name="Person") 
	public Person getPerson(
			@WebParam(name="username") String username
			);
	@WebMethod(operationName="getPersonByToken")
    @WebResult(name="Person") 
	public Person getPersonByToken(
			@WebParam(name="token") String token
			);
	
	@WebMethod(operationName="updateUser")
    @WebResult(name="Person") 
	public Person updatePerson(
			@WebParam(name="person") Person person
			);
	
	@WebMethod(operationName="getFoodTypes")
    @WebResult(name="FoodTypeList") 
	public List<FoodType> getFoodTypes();
	
	@WebMethod(operationName="getMovieGens")
    @WebResult(name="MovieGenList") 
	public List<MovieGen> getMovieGens();
	
	
	///////recombee DB
	
	@WebMethod(operationName="getAllItem")
    @WebResult(name="ListofStrings") 
	public List<ItemObject> getAllItem(
			@WebParam(name="dbName") RecombeeDBType db
			);
	
	@WebMethod(operationName="getItemsByType")
    @WebResult(name="ListofStrings") 
	public List<ItemObject> getItemsByType(
			@WebParam(name="dbName") RecombeeDBType db,
			@WebParam(name="itemName") String itemType
			);
	
	
	@WebMethod(operationName="addNewRating")
    @WebResult(name="boolean") 
    public boolean addNewRating(
    		@WebParam(name="dbName") RecombeeDBType db,
    		@WebParam(name="rating") Evaluation rating
    		);

	
	@WebMethod(operationName="getUserRatings")
    @WebResult(name="ratingList") 
    public List<Evaluation> getUserRatings(
    		@WebParam(name="dbName") RecombeeDBType db,
    		@WebParam(name="person") Person person
    		);
	
	@WebMethod(operationName="getRecommendations")
    @WebResult(name="recommendations") 
    public List<ItemObject> getRecommendations(
    		@WebParam(name="dbName") RecombeeDBType db,
    		@WebParam(name="person") Person person,
    		@WebParam(name="quantity") int quantity
    		);

}
