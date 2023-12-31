package Pages;

//In order to use REST assured effectively it's recommended to statically import methods from the following classes:
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Set;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Beginner {

//	@Test
//	public void getTest() {
//		
//		given()
//		 .contentType("application/json")
//		 
//		.when()
//		  .get("https://reqres.in/api/users?page=2")
//		  
//		.then()
//		  .statusCode(200)
//		  .body("data[0].id",equalTo(7))
//		  .log().all();
//	}

	// post request with request data using HashMap
//	@Test
//	public void postTestWithHashMap() {
//		
//		HashMap<String, String> data=new HashMap<String,String>();
//		
//		data.put("name","sai");
//		data.put("number","9030473710");
//		data.put("address", "dwaraka");
//		
//		given()
//		.contentType("application/json")
//		.body(data)
//		.when()
//		.post("https://reqres.in/api/users")
//		.then()
//		.statusCode(201)
//		.body("name",equalTo("sai"))
//		.body("number",equalTo("9030473710"))
//		.log().all();
//		
//	}

	// post request with request body using org.json(JSONObject)
//	@Test
//	public void postTestWithJSONObj() {
//		
//		JSONObject data=new JSONObject();
//		
//		data.put("name","sai");
//		data.put("number","9030473710");
//		data.put("address", "dwaraka");
//		
//		given()
//		.contentType("application/json")
//		.body(data.toString())
//		.when()
//		.post("https://reqres.in/api/users")
//		.then()
//		.statusCode(201)
//		.body("name",equalTo("sai"))
//		.body("number",equalTo("9030473710"))
//		.log().all();
//		
//	}

	// post request with request body using POJOClass
//	@Test
//	public void postTestWithPOJOClass() {
//		
//		POJOClass data=new POJOClass();
//		
//		
//		data.setName("sai");
//		data.setNumber("9030473710");
//		data.setAddress("dwaraka");
//		
//		given()
//		.contentType("application/json")
//		.body(data)
//		.when()
//		.post("https://reqres.in/api/users")
//		.then()
//		.statusCode(201)
//		.body("name",equalTo("sai"))
//		.body("number",equalTo("9030473710"))
//		.log().all();
//		
//	}

	// post request with request body using external Json file
//	@Test
//	
//	public void postTestWithPOJOClass() throws FileNotFoundException {
//		
//		File file=new File(".//src/test/resources/JSONTestdata.json");
//		FileReader fr=new FileReader(file);
//		JSONTokener jt=new JSONTokener(fr);
//		
//		JSONObject data=new JSONObject(jt);
//		
//		
//		data.put("name","sai");
//		data.put("number","9030473710");
//		data.put("address", "dwaraka");
//		
//		given()
//		.contentType("application/json")
//		.body(data.toString())
//		.when()
//		.post("https://reqres.in/api/users")
//		.then()
//		.statusCode(201)
//		.body("name",equalTo("sai"))
//		.body("number",equalTo("9030473710"))
//		.log().all();
//		
//	}

	// path parameters and query parameters
//	@Test
//	public void pathParameters(){
//		
//		given()
//		 .pathParam("mypath","user")
//		 .queryParam("page",2)
//		.when()
//		.get("https://reqres.in/api/{mypath}")
//		.then()
//		.statusCode(200)
//		.log().all();
//		
//	}

	// Cookies
//	@Test
//	public void cookies() {

		//cookies storing in response variable
//		Response res = given().when().get("https://flipkart.com");
//		
//		Map<String,String> cookies=res.getCookies();
//		
//		Set<String> cookiesKey=cookies.keySet();
//		
//		for(String cookie:cookiesKey) {
//			System.out.println(res.getCookie(cookie));
//		}
		
		//cookies directly through log()
//		given()
//		.when()
//		.get("https://flipkart.com")
//		.then()
//		.log().cookies();

//	}

	 //Headers
//		@Test
//		public void headers() {
//
//		//headers storing in response variable
//			Response res = given().when().get("https://flipkart.com");
//			
//			Headers headers=res.getHeaders();
//			
//			for(Header header:headers) {
//				System.out.println(header.getName()+" "+header.getValue());
//			}
//		
//		//cookies directly through log()
//		given()
//		.when()
//		.get("https://flipkart.com")
//		.then()
//		.log().headers();
//
//}
}
			
			










