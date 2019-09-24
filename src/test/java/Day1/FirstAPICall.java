package Day1;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

import io.restassured.response.Response;

public class FirstAPICall {
  @Test
  public void f() {
	  
	Response response=  RestAssured.given()
			           .proxy("192.168.100.1", 8081)           
		               .get(
			           "https://parabank.parasoft.com/parabank/services/bank/customers/12212");
	  
	//HTTP status code
	  int status= response.statusCode();
	  System.out.println("Status code is" + status);
	  System.out.println(response.prettyPrint().toString());
	  System.out.println(response.asString());
	  System.out.println(response.getTime());
	  
	  Assert.assertEquals(status, 200)	;  
	 
  
  //@Test(enabled=false)
 // public void f2() {
	//  Response response = RestAssured.given().proxy("192.168.100.1", 8081)
                       given()
                        .proxy("192.168.100.1", 8081)
                       .when()
                       .get("https://parabank.parasoft.com/parabank/services/bank/customers/12212")
                      .then()
                      .statusCode(200);

}
}

