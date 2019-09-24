package Day1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Auth {
  @Test
  public void f() {
	  given()
	  .proxy("192.168.100.1", 8081)
	  .auth()
	  .oauth2("69bf75946e82abfb3e650b14134b775125b723ca")
	  .when()
	  .get("http://coop.apps.symfonycasts.com/api/418/chickens-feed")
	  .then()
	  .statusCode(200);

	  
	  
	  
	  
	  
	  
  }
}
