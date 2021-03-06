
package introsde.project.storage.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.project.storage.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetItemRatings_QNAME = new QName("http://soap.storage.project.introsde/", "getItemRatings");
    private final static QName _GetMovieGens_QNAME = new QName("http://soap.storage.project.introsde/", "getMovieGens");
    private final static QName _GetUserRatings_QNAME = new QName("http://soap.storage.project.introsde/", "getUserRatings");
    private final static QName _GetUserResponse_QNAME = new QName("http://soap.storage.project.introsde/", "getUserResponse");
    private final static QName _GetUser_QNAME = new QName("http://soap.storage.project.introsde/", "getUser");
    private final static QName _GetRec4UserResponse_QNAME = new QName("http://soap.storage.project.introsde/", "getRec4UserResponse");
    private final static QName _GetPersonByTokenResponse_QNAME = new QName("http://soap.storage.project.introsde/", "getPersonByTokenResponse");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://soap.storage.project.introsde/", "updateUserResponse");
    private final static QName _GetFoodTypesResponse_QNAME = new QName("http://soap.storage.project.introsde/", "getFoodTypesResponse");
    private final static QName _AddNewUser_QNAME = new QName("http://soap.storage.project.introsde/", "addNewUser");
    private final static QName _AddNewRatingResponse_QNAME = new QName("http://soap.storage.project.introsde/", "addNewRatingResponse");
    private final static QName _AddNewUserResponse_QNAME = new QName("http://soap.storage.project.introsde/", "addNewUserResponse");
    private final static QName _InitDBResponse_QNAME = new QName("http://soap.storage.project.introsde/", "initDBResponse");
    private final static QName _GetAllItemResponse_QNAME = new QName("http://soap.storage.project.introsde/", "getAllItemResponse");
    private final static QName _GetItemByType_QNAME = new QName("http://soap.storage.project.introsde/", "getItemByType");
    private final static QName _GetUserRatingsResponse_QNAME = new QName("http://soap.storage.project.introsde/", "getUserRatingsResponse");
    private final static QName _UpdateUser_QNAME = new QName("http://soap.storage.project.introsde/", "updateUser");
    private final static QName _GetItemByTypeResponse_QNAME = new QName("http://soap.storage.project.introsde/", "getItemByTypeResponse");
    private final static QName _GetMovieGensResponse_QNAME = new QName("http://soap.storage.project.introsde/", "getMovieGensResponse");
    private final static QName _GetRec4User_QNAME = new QName("http://soap.storage.project.introsde/", "getRec4User");
    private final static QName _GetPersonByToken_QNAME = new QName("http://soap.storage.project.introsde/", "getPersonByToken");
    private final static QName _InitDB_QNAME = new QName("http://soap.storage.project.introsde/", "initDB");
    private final static QName _GetFoodTypes_QNAME = new QName("http://soap.storage.project.introsde/", "getFoodTypes");
    private final static QName _AddNewRating_QNAME = new QName("http://soap.storage.project.introsde/", "addNewRating");
    private final static QName _GetAllItem_QNAME = new QName("http://soap.storage.project.introsde/", "getAllItem");
    private final static QName _GetItemRatingsResponse_QNAME = new QName("http://soap.storage.project.introsde/", "getItemRatingsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.project.storage.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link GetMovieGens }
     * 
     */
    public GetMovieGens createGetMovieGens() {
        return new GetMovieGens();
    }

    /**
     * Create an instance of {@link GetUserRatings }
     * 
     */
    public GetUserRatings createGetUserRatings() {
        return new GetUserRatings();
    }

    /**
     * Create an instance of {@link GetItemRatings }
     * 
     */
    public GetItemRatings createGetItemRatings() {
        return new GetItemRatings();
    }

    /**
     * Create an instance of {@link AddNewUserResponse }
     * 
     */
    public AddNewUserResponse createAddNewUserResponse() {
        return new AddNewUserResponse();
    }

    /**
     * Create an instance of {@link GetFoodTypesResponse }
     * 
     */
    public GetFoodTypesResponse createGetFoodTypesResponse() {
        return new GetFoodTypesResponse();
    }

    /**
     * Create an instance of {@link AddNewUser }
     * 
     */
    public AddNewUser createAddNewUser() {
        return new AddNewUser();
    }

    /**
     * Create an instance of {@link AddNewRatingResponse }
     * 
     */
    public AddNewRatingResponse createAddNewRatingResponse() {
        return new AddNewRatingResponse();
    }

    /**
     * Create an instance of {@link InitDBResponse }
     * 
     */
    public InitDBResponse createInitDBResponse() {
        return new InitDBResponse();
    }

    /**
     * Create an instance of {@link GetPersonByTokenResponse }
     * 
     */
    public GetPersonByTokenResponse createGetPersonByTokenResponse() {
        return new GetPersonByTokenResponse();
    }

    /**
     * Create an instance of {@link GetRec4UserResponse }
     * 
     */
    public GetRec4UserResponse createGetRec4UserResponse() {
        return new GetRec4UserResponse();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link GetFoodTypes }
     * 
     */
    public GetFoodTypes createGetFoodTypes() {
        return new GetFoodTypes();
    }

    /**
     * Create an instance of {@link GetPersonByToken }
     * 
     */
    public GetPersonByToken createGetPersonByToken() {
        return new GetPersonByToken();
    }

    /**
     * Create an instance of {@link InitDB }
     * 
     */
    public InitDB createInitDB() {
        return new InitDB();
    }

    /**
     * Create an instance of {@link GetUserRatingsResponse }
     * 
     */
    public GetUserRatingsResponse createGetUserRatingsResponse() {
        return new GetUserRatingsResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link GetAllItemResponse }
     * 
     */
    public GetAllItemResponse createGetAllItemResponse() {
        return new GetAllItemResponse();
    }

    /**
     * Create an instance of {@link GetItemByType }
     * 
     */
    public GetItemByType createGetItemByType() {
        return new GetItemByType();
    }

    /**
     * Create an instance of {@link GetItemByTypeResponse }
     * 
     */
    public GetItemByTypeResponse createGetItemByTypeResponse() {
        return new GetItemByTypeResponse();
    }

    /**
     * Create an instance of {@link GetMovieGensResponse }
     * 
     */
    public GetMovieGensResponse createGetMovieGensResponse() {
        return new GetMovieGensResponse();
    }

    /**
     * Create an instance of {@link GetRec4User }
     * 
     */
    public GetRec4User createGetRec4User() {
        return new GetRec4User();
    }

    /**
     * Create an instance of {@link GetItemRatingsResponse }
     * 
     */
    public GetItemRatingsResponse createGetItemRatingsResponse() {
        return new GetItemRatingsResponse();
    }

    /**
     * Create an instance of {@link GetAllItem }
     * 
     */
    public GetAllItem createGetAllItem() {
        return new GetAllItem();
    }

    /**
     * Create an instance of {@link AddNewRating }
     * 
     */
    public AddNewRating createAddNewRating() {
        return new AddNewRating();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemRatings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getItemRatings")
    public JAXBElement<GetItemRatings> createGetItemRatings(GetItemRatings value) {
        return new JAXBElement<GetItemRatings>(_GetItemRatings_QNAME, GetItemRatings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieGens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getMovieGens")
    public JAXBElement<GetMovieGens> createGetMovieGens(GetMovieGens value) {
        return new JAXBElement<GetMovieGens>(_GetMovieGens_QNAME, GetMovieGens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserRatings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getUserRatings")
    public JAXBElement<GetUserRatings> createGetUserRatings(GetUserRatings value) {
        return new JAXBElement<GetUserRatings>(_GetUserRatings_QNAME, GetUserRatings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRec4UserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getRec4UserResponse")
    public JAXBElement<GetRec4UserResponse> createGetRec4UserResponse(GetRec4UserResponse value) {
        return new JAXBElement<GetRec4UserResponse>(_GetRec4UserResponse_QNAME, GetRec4UserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getPersonByTokenResponse")
    public JAXBElement<GetPersonByTokenResponse> createGetPersonByTokenResponse(GetPersonByTokenResponse value) {
        return new JAXBElement<GetPersonByTokenResponse>(_GetPersonByTokenResponse_QNAME, GetPersonByTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getFoodTypesResponse")
    public JAXBElement<GetFoodTypesResponse> createGetFoodTypesResponse(GetFoodTypesResponse value) {
        return new JAXBElement<GetFoodTypesResponse>(_GetFoodTypesResponse_QNAME, GetFoodTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "addNewUser")
    public JAXBElement<AddNewUser> createAddNewUser(AddNewUser value) {
        return new JAXBElement<AddNewUser>(_AddNewUser_QNAME, AddNewUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewRatingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "addNewRatingResponse")
    public JAXBElement<AddNewRatingResponse> createAddNewRatingResponse(AddNewRatingResponse value) {
        return new JAXBElement<AddNewRatingResponse>(_AddNewRatingResponse_QNAME, AddNewRatingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "addNewUserResponse")
    public JAXBElement<AddNewUserResponse> createAddNewUserResponse(AddNewUserResponse value) {
        return new JAXBElement<AddNewUserResponse>(_AddNewUserResponse_QNAME, AddNewUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitDBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "initDBResponse")
    public JAXBElement<InitDBResponse> createInitDBResponse(InitDBResponse value) {
        return new JAXBElement<InitDBResponse>(_InitDBResponse_QNAME, InitDBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getAllItemResponse")
    public JAXBElement<GetAllItemResponse> createGetAllItemResponse(GetAllItemResponse value) {
        return new JAXBElement<GetAllItemResponse>(_GetAllItemResponse_QNAME, GetAllItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getItemByType")
    public JAXBElement<GetItemByType> createGetItemByType(GetItemByType value) {
        return new JAXBElement<GetItemByType>(_GetItemByType_QNAME, GetItemByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserRatingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getUserRatingsResponse")
    public JAXBElement<GetUserRatingsResponse> createGetUserRatingsResponse(GetUserRatingsResponse value) {
        return new JAXBElement<GetUserRatingsResponse>(_GetUserRatingsResponse_QNAME, GetUserRatingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getItemByTypeResponse")
    public JAXBElement<GetItemByTypeResponse> createGetItemByTypeResponse(GetItemByTypeResponse value) {
        return new JAXBElement<GetItemByTypeResponse>(_GetItemByTypeResponse_QNAME, GetItemByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieGensResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getMovieGensResponse")
    public JAXBElement<GetMovieGensResponse> createGetMovieGensResponse(GetMovieGensResponse value) {
        return new JAXBElement<GetMovieGensResponse>(_GetMovieGensResponse_QNAME, GetMovieGensResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRec4User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getRec4User")
    public JAXBElement<GetRec4User> createGetRec4User(GetRec4User value) {
        return new JAXBElement<GetRec4User>(_GetRec4User_QNAME, GetRec4User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getPersonByToken")
    public JAXBElement<GetPersonByToken> createGetPersonByToken(GetPersonByToken value) {
        return new JAXBElement<GetPersonByToken>(_GetPersonByToken_QNAME, GetPersonByToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "initDB")
    public JAXBElement<InitDB> createInitDB(InitDB value) {
        return new JAXBElement<InitDB>(_InitDB_QNAME, InitDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getFoodTypes")
    public JAXBElement<GetFoodTypes> createGetFoodTypes(GetFoodTypes value) {
        return new JAXBElement<GetFoodTypes>(_GetFoodTypes_QNAME, GetFoodTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewRating }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "addNewRating")
    public JAXBElement<AddNewRating> createAddNewRating(AddNewRating value) {
        return new JAXBElement<AddNewRating>(_AddNewRating_QNAME, AddNewRating.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getAllItem")
    public JAXBElement<GetAllItem> createGetAllItem(GetAllItem value) {
        return new JAXBElement<GetAllItem>(_GetAllItem_QNAME, GetAllItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemRatingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.storage.project.introsde/", name = "getItemRatingsResponse")
    public JAXBElement<GetItemRatingsResponse> createGetItemRatingsResponse(GetItemRatingsResponse value) {
        return new JAXBElement<GetItemRatingsResponse>(_GetItemRatingsResponse_QNAME, GetItemRatingsResponse.class, null, value);
    }

}
