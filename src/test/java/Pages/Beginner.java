package Pages;

//In order to use REST assured effectively it's recommended to statically import methods from the following classes:
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

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
	
	
	
	//post request with request data using HashMap
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
	
	//post request with request body using org.json(JSONObject)
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
	
	//post request with request body using POJOClass
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
	
	//post request with request body using external Json file
	@Test
	public void postTestWithPOJOClass() throws FileNotFoundException {
		
		File file=new File(".//src/test/resources/JSONTestdata.json");
		FileReader fr=new FileReader(file);
		JSONTokener jt=new JSONTokener(fr);
		
		JSONObject data=new JSONObject(jt);
		
		
		data.put("name","sai");
		data.put("number","9030473710");
		data.put("address", "dwaraka");
		
		given()
		.contentType("application/json")
		.body(data.toString())
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.body("name",equalTo("sai"))
		.body("number",equalTo("9030473710"))
		.log().all();
		
	}
	
	
	
}
