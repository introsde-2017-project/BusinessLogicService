package introsde.project.business.model;


//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import javax.xml.datatype.DatatypeConfigurationException;


public class DBinit {
//	private static UserImplService serviceImp;
//	private static UserInterface serviceInt;
////	
//	public static void main(String[] args) {
////		init1();
////		getRec();
////		init2();
//		
//		
////		serviceImp = new UserImplService();
////		serviceInt = serviceImp.getUserImplPort();
////		
////		Person p = new ObjectFactory().createPerson();
////		//Person p= new Person("name","last","user","pass",FoodType.CHINESE,MovieGen.ACTION);
////		p.setFirstName("name");
////		p.setLastName("last");
////		p.setUserName("username");
////		p.setPassword("password");
////		p.getFoodTypes().add(FoodType.CHINESE);
////		p.getMovieGens().add(MovieGen.ACTION);
////		Person q=serviceInt.addPerson(p);
////		
////		
////		System.out.println(q.getIdPerson());
////		System.out.println(q.getFoodTypes().get(0).toString());
////		q.getFoodTypes().add(FoodType.INDIAN);
////		q= serviceInt.updatePerson(q);
////		System.out.println(q.getFoodTypes().get(1).toString());
////		
//	}
//
//	private static void init2() {
//		
//		JSONParser parser = new JSONParser();
//        
//		try {
//			JSONArray a = (JSONArray) parser.parse(new FileReader("movie_rating.json"));
//			for (Object o : a) {
//				JSONObject interaction = (JSONObject) o;
//				
//				Person p = new ObjectFactory().createPerson();
//				p.setUserName((String) interaction.get("user_name"));
//				p.setPassword((String) interaction.get("password"));
//				Person p1=DataService.addPerson(p);
//				
//				Movie m= new ObjectFactory().createMovie();
//				m.setName((String) interaction.get("item_name"));
//				m.setGenere(MovieGen.fromValue((String) interaction.get("item_type")));
//				Movie m1=DataService.addMovie(m);
//				
//				double rating =Double.valueOf((String) interaction.get("item_rating"));
//				Date time =  new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse((String)interaction.get("timestamp"));
//								
//				DataService.addMovieRating(p1.getIdPerson(), m1.getIdMovie(), rating, time);
//			
//	                
//	        }
//		} catch (ParseException e) {
//			e.printStackTrace();
//		} catch (java.text.ParseException e) {
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (DatatypeConfigurationException e) {
//			e.printStackTrace();
//		}
//            
//	}
//		
//	
//
//	private static void getRec() {
//		//DataService.getFoodRec(150,5);
//		for(Movie f: DataService.getMovieRecom(DataService.getPersonByU("michael4").getIdPerson(),5)) {
//			System.out.println(f.getIdMovie());
//		}
//		
//		
//	}
//
//	public static void init1() {
//		
//		JSONParser parser = new JSONParser();
//        
//		try {
//			JSONArray a = (JSONArray) parser.parse(new FileReader("food_rating.json"));
//			for (Object o : a) {
//				JSONObject interaction = (JSONObject) o;
//				
//				Person p = new ObjectFactory().createPerson();
//				p.setUserName((String) interaction.get("user_name"));
//				p.setPassword((String) interaction.get("password"));
//				Person p1=DataService.addPerson(p);
//				
//				Food f= new ObjectFactory().createFood();
//				f.setName((String) interaction.get("item_name"));
//				f.setType(FoodType.fromValue((String) interaction.get("item_type")));
//				Food f1=DataService.addFood(f);
//				
//				double rating =Double.valueOf((String) interaction.get("item_rating"));
//				Date time =  new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse((String)interaction.get("timestamp"));
//								
//				DataService.addFoodRating(p1.getIdPerson(), f1.getIdFood(), rating, time);
//			
//	                
//	        }
//		} catch (ParseException e) {
//			e.printStackTrace();
//		} catch (java.text.ParseException e) {
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (DatatypeConfigurationException e) {
//			e.printStackTrace();
//		}
//            
//	}
	
}
