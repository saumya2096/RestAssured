package Day1;


import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import io.restassured.RestAssured;
import io.restassured.http.ContentType; 
import io.restassured.response.Response;

public class StudentAppAPICalls {
  @Test
  public void getCall() {
	  given()
	  .when()
	  .get("http://localhost:9090/student/list")
	  .then()
	  .statusCode(200);
	  
	  Response R=  given()
	                           .when()
	                           .get("http://localhost:9090/student/1");
	  
	  System.out.println(R.prettyPrint().toString());
	  String fname=R.jsonPath().get("firstName");
	  Assert.assertEquals(fname,"Vernon");
	  System.out.println(R.getTime());
	  
  }
  
  @Test
  
  public void deleteCall() {
	  given()
	  .when()
	  .get("http://localhost:9090/student/list")
	  .then()
	  .statusCode(200);
	  
	  Response R=  given()
	                           .when()
	                           .delete("http://localhost:9090/student/100");
	  
	  System.out.println(R.prettyPrint().toString());
	  
	  System.out.println(R.getTime());
}

 @Test(enabled=false)
   public void postCall() {
	  ArrayList<String> courses=new ArrayList<String>();
	  courses.add("Digital Communication");
	  courses.add("computer Networking");
	  courses.add("software Testing");
	  
	  Student st=new Student();
	  st.setFirstName("mohit");
	  st.setLastName("sharma");
	  st.setEmail("mohit@gmail.com");
	  st.setProgramme("ENTC");
	  st.setCourses(courses);
	  
	  
	  given()
	  .contentType(ContentType.JSON)
	  .when()
	  .body(st)
	  .post("http://localhost:9090/student/")
	  .then()
	  .statusCode(201);
	  
  
}
 @Test
 public void putCall() {
	  ArrayList<String> courses=new ArrayList<String>();
	  courses.add("Digital Communication");
	  courses.add("computer Networking");
	  courses.add("software Testing");
	  
	  
	  Student st=new Student();
	  st.setFirstName("mohit");
	  st.setLastName("sharma");
	  st.setEmail("mohit@gmail.com");
	  st.setProgramme("IT");
	  st.setCourses(courses);
	  
	  
	  given()
	  .contentType(ContentType.JSON)
	  .when()
	  .body(st)
	  .put("http://localhost:9090/student/101")
	  .then()
	  .statusCode(200);
	  
 


 }
}
