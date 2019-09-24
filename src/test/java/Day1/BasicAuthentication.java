package Day1;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import io.restassured.RestAssured;
import io.restassured.http.ContentType; 
import io.restassured.response.Response;

public class BasicAuthentication {
	
	@BeforeClass
	public void beforeClass()
	{
	//	RestAssured.proxy=RestAssured.proxy(new Proxy);
		RestAssured.authentication=RestAssured.preemptive().basic("ToolsQA", "TestPassword");
	}
	
	
	
	
  @Test
  public void PreemptiveAuthentication() {
	//  given()
//	  .proxy("192.168.100.1", 8081)
	//  .auth()
//	  .preemptive()
	//  .basic("ToolsQA", "TestPassword")
	//  .when()
	//  .get("http://restapi.demoqa.com/authentication/CheckForAuthentication/")
//	  .then()
//	  .statusCode(200);

	  given()
	  .proxy("192.168.100.1", 8081)
	  .when()
	  .get("http://restapi.demoqa.com/authentication/CheckForAuthentication/")
	  .then()
		  .statusCode(200);
	  
  }
}
