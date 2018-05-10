package introsde.project.business.rest.resources;

//import java.io.IOException;
//import java.util.List;
//import java.util.StringTokenizer;
//
//import javax.persistence.EntityExistsException;
//import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
//import javax.ws.rs.HeaderParam;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;

//import java.util.Base64;
//
//import introsde.project.data.soap.ws.Food;
//import introsde.project.data.soap.ws.Movie;
//import introsde.project.data.soap.ws.Person;

//@Path("/user")
public class UserResource {
//	// Allows to insert contextual objects into the class,
//    // e.g. ServletContext, Request, Response, UriInfo
//    @Context
//    UriInfo uriInfo;
//    @Context
//    Request request;
	
    
//    @Path("/signup")
//    @POST
//    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
//    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public Person newPerson(Person person) {
//        System.out.println("Creating new person...");
//        if(StorageService.getPersonByU(person.getUserName())!=null)
//        	throw new EntityExistsException();
//        return StorageService.addPerson(person);
//    }
//    
//    
//    
//    @Path("/secure/recom/m/{quantity}")
//    @GET
//    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public List<String> getMovieRecom(@PathParam("quantity") int quantity, @HeaderParam("authorization") String authString){
//        int personId= getAuthentication(authString);
//        if(personId==-1) 
//        	return null;
//        else 
//        	return StorageService.getMovieRecom(personId, quantity);
//    }
//    
//    @Path("/secure/recom/f/{quantity}")
//    @GET
//    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//    public List<String> getFoodRecom(@PathParam("quantity") int quantity, @HeaderParam("authorization") String authString){
//		int personId= getAuthentication(authString);
//        if(personId==-1)
//        	return null;
//        else
//        	return StorageService.getFoodRecom(personId, quantity);
//    }
//    
//    private int getAuthentication(String authCredentials) {
//    	if (null == authCredentials)
//			return -1;
//		// header value format will be "Basic encodedstring" for Basic
//		// authentication. Example "Basic YWRtaW46YWRtaW4="
//		final String encodedUserPassword = authCredentials.replaceFirst("Basic"
//				+ " ", "");
//		String usernameAndPassword = null;
//		try {
//			byte[] decodedBytes = Base64.getDecoder().decode(
//					encodedUserPassword);
//			usernameAndPassword = new String(decodedBytes, "UTF-8");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		final StringTokenizer tokenizer = new StringTokenizer(
//				usernameAndPassword, ":");
//		final String username = tokenizer.nextToken();
//		final String password = tokenizer.nextToken();
//
//		Person p=StorageService.getPersonByU(username);
//		if(p.getPassword().equals(password))
//			return p.getIdPerson();
//		else
//			return -1;
//	}

}
