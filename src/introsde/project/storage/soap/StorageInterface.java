
package introsde.project.storage.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import introsde.project.adopter.recombee.soap.Evaluation;
import introsde.project.adopter.recombee.soap.ItemObject;
import introsde.project.adopter.recombee.soap.RecombeeDBType;
import introsde.project.data.local.soap.FoodType;
import introsde.project.data.local.soap.MovieGen;
import introsde.project.data.local.soap.Person;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StorageInterface", targetNamespace = "http://soap.storage.project.introsde/")
@XmlSeeAlso({
    introsde.project.adopter.recombee.soap.ObjectFactory.class,
    introsde.project.data.local.soap.ObjectFactory.class,
    introsde.project.storage.soap.ObjectFactory.class
})
public interface StorageInterface {


    /**
     * 
     * @param quantity
     * @param person
     * @param dbName
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "recommendations", targetNamespace = "")
    @RequestWrapper(localName = "getRec4User", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetRec4User")
    @ResponseWrapper(localName = "getRec4UserResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetRec4UserResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/getRec4UserRequest", output = "http://soap.storage.project.introsde/StorageInterface/getRec4UserResponse")
    public List<String> getRec4User(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "person", targetNamespace = "")
        Person person,
        @WebParam(name = "quantity", targetNamespace = "")
        int quantity);

    /**
     * 
     * @param username
     * @return
     *     returns introsde.project.data.local.soap.Person
     */
    @WebMethod
    @WebResult(name = "Person", targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetUserResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/getUserRequest", output = "http://soap.storage.project.introsde/StorageInterface/getUserResponse")
    public Person getUser(
        @WebParam(name = "username", targetNamespace = "")
        String username);

    /**
     * 
     * @param person
     * @return
     *     returns introsde.project.data.local.soap.Person
     */
    @WebMethod
    @WebResult(name = "Person", targetNamespace = "")
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.UpdateUserResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/updateUserRequest", output = "http://soap.storage.project.introsde/StorageInterface/updateUserResponse")
    public Person updateUser(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param person
     * @return
     *     returns introsde.project.data.local.soap.Person
     */
    @WebMethod
    @WebResult(name = "Person", targetNamespace = "")
    @RequestWrapper(localName = "addNewUser", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.AddNewUser")
    @ResponseWrapper(localName = "addNewUserResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.AddNewUserResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/addNewUserRequest", output = "http://soap.storage.project.introsde/StorageInterface/addNewUserResponse")
    public Person addNewUser(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param itemName
     * @param itemType
     * @param dbName
     * @param location
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "itemId", targetNamespace = "")
    @RequestWrapper(localName = "addNewItem", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.AddNewItem")
    @ResponseWrapper(localName = "addNewItemResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.AddNewItemResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/addNewItemRequest", output = "http://soap.storage.project.introsde/StorageInterface/addNewItemResponse")
    public String addNewItem(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "itemName", targetNamespace = "")
        String itemName,
        @WebParam(name = "itemType", targetNamespace = "")
        String itemType,
        @WebParam(name = "location", targetNamespace = "")
        String location);

    /**
     * 
     * @param evaluation
     * @param dbName
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "boolean", targetNamespace = "")
    @RequestWrapper(localName = "addNewRating", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.AddNewRating")
    @ResponseWrapper(localName = "addNewRatingResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.AddNewRatingResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/addNewRatingRequest", output = "http://soap.storage.project.introsde/StorageInterface/addNewRatingResponse")
    public boolean addNewRating(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "evaluation", targetNamespace = "")
        Evaluation evaluation);

    /**
     * 
     * @param evaluation
     * @param dbName
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "boolean", targetNamespace = "")
    @RequestWrapper(localName = "modifyRating", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.ModifyRating")
    @ResponseWrapper(localName = "modifyRatingResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.ModifyRatingResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/modifyRatingRequest", output = "http://soap.storage.project.introsde/StorageInterface/modifyRatingResponse")
    public boolean modifyRating(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "evaluation", targetNamespace = "")
        Evaluation evaluation);

    /**
     * 
     * @param itemName
     * @param dbName
     * @return
     *     returns java.util.List<introsde.project.adopter.recombee.soap.Evaluation>
     */
    @WebMethod
    @WebResult(name = "ratingList", targetNamespace = "")
    @RequestWrapper(localName = "getItemRatings", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetItemRatings")
    @ResponseWrapper(localName = "getItemRatingsResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetItemRatingsResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/getItemRatingsRequest", output = "http://soap.storage.project.introsde/StorageInterface/getItemRatingsResponse")
    public List<Evaluation> getItemRatings(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "itemName", targetNamespace = "")
        String itemName);

    /**
     * 
     * @param person
     * @param dbName
     * @return
     *     returns java.util.List<introsde.project.adopter.recombee.soap.Evaluation>
     */
    @WebMethod
    @WebResult(name = "ratingList", targetNamespace = "")
    @RequestWrapper(localName = "getUserRatings", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetUserRatings")
    @ResponseWrapper(localName = "getUserRatingsResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetUserRatingsResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/getUserRatingsRequest", output = "http://soap.storage.project.introsde/StorageInterface/getUserRatingsResponse")
    public List<Evaluation> getUserRatings(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param dbName
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "ListofStrings", targetNamespace = "")
    @RequestWrapper(localName = "getAllItem", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetAllItem")
    @ResponseWrapper(localName = "getAllItemResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetAllItemResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/getAllItemRequest", output = "http://soap.storage.project.introsde/StorageInterface/getAllItemResponse")
    public List<String> getAllItem(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName);

    /**
     * 
     * @param itemName
     * @param dbName
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "ListofStrings", targetNamespace = "")
    @RequestWrapper(localName = "getItemByType", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetItemByType")
    @ResponseWrapper(localName = "getItemByTypeResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetItemByTypeResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/getItemByTypeRequest", output = "http://soap.storage.project.introsde/StorageInterface/getItemByTypeResponse")
    public List<String> getItemByType(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "itemName", targetNamespace = "")
        String itemName);

    /**
     * 
     * @param dbName
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "boolean", targetNamespace = "")
    @RequestWrapper(localName = "initDB", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.InitDB")
    @ResponseWrapper(localName = "initDBResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.InitDBResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/initDBRequest", output = "http://soap.storage.project.introsde/StorageInterface/initDBResponse")
    public boolean initDB(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName);

    /**
     * 
     * @param dbName
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "boolean", targetNamespace = "")
    @RequestWrapper(localName = "resetDB", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.ResetDB")
    @ResponseWrapper(localName = "resetDBResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.ResetDBResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/resetDBRequest", output = "http://soap.storage.project.introsde/StorageInterface/resetDBResponse")
    public boolean resetDB(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.project.data.local.soap.FoodType>
     */
    @WebMethod
    @WebResult(name = "FoodTypeList", targetNamespace = "")
    @RequestWrapper(localName = "getFoodTypes", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetFoodTypes")
    @ResponseWrapper(localName = "getFoodTypesResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetFoodTypesResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/getFoodTypesRequest", output = "http://soap.storage.project.introsde/StorageInterface/getFoodTypesResponse")
    public List<FoodType> getFoodTypes();

    /**
     * 
     * @return
     *     returns java.util.List<introsde.project.data.local.soap.MovieGen>
     */
    @WebMethod
    @WebResult(name = "MovieGenList", targetNamespace = "")
    @RequestWrapper(localName = "getMovieGens", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetMovieGens")
    @ResponseWrapper(localName = "getMovieGensResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetMovieGensResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/getMovieGensRequest", output = "http://soap.storage.project.introsde/StorageInterface/getMovieGensResponse")
    public List<MovieGen> getMovieGens();

    /**
     * 
     * @return
     *     returns java.util.List<introsde.project.data.local.soap.Person>
     */
    @WebMethod
    @WebResult(name = "PersonList", targetNamespace = "")
    @RequestWrapper(localName = "getAllUser", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetAllUser")
    @ResponseWrapper(localName = "getAllUserResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetAllUserResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/getAllUserRequest", output = "http://soap.storage.project.introsde/StorageInterface/getAllUserResponse")
    public List<Person> getAllUser();

    /**
     * 
     * @param itemName
     * @param dbName
     * @return
     *     returns introsde.project.adopter.recombee.soap.ItemObject
     */
    @WebMethod
    @WebResult(name = "ListofPropertiesofItem", targetNamespace = "")
    @RequestWrapper(localName = "getItem", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetItem")
    @ResponseWrapper(localName = "getItemResponse", targetNamespace = "http://soap.storage.project.introsde/", className = "introsde.project.storage.soap.GetItemResponse")
    @Action(input = "http://soap.storage.project.introsde/StorageInterface/getItemRequest", output = "http://soap.storage.project.introsde/StorageInterface/getItemResponse")
    public ItemObject getItem(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "itemName", targetNamespace = "")
        String itemName);

}
