package np.qa.diploma.helpers;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;

public class Specs {
    public static RequestSpecification request = with()
            .baseUri("https://dummyapi.io/data/v1/")
            //необходимое поле для получения данных. Получить можно после авторизации на сайте
            .header("app-id","62462762b6b34a12203f2f6e");
         //   .log().all();
            //.contentType(ContentType.JSON);

    public static ResponseSpecification responseSpec = new ResponseSpecBuilder()
            .expectStatusCode(200)
//            .expectBody(containsString("success"))
            .build();
}