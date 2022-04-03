package np.qa.diploma.helpers;

import com.github.javafaker.Faker;
import np.qa.diploma.models.UserData;

import java.util.ArrayList;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static np.qa.diploma.helpers.CustomAllureListener.withCustomTemplates;
import static np.qa.diploma.helpers.Specs.request;

public class TestHelper {
    private static Faker fakeData = new Faker();

    public String getRandomEmail() {
        String email = fakeData.internet().emailAddress();
        return email;
    }


    public UserData getUserData() {
        UserData users = given()
                .filter(withCustomTemplates())
                .spec(request)
                .when()
                .get("user")
                .then()
                .statusCode(200)
                //  .log().body()
                .extract().as(UserData.class);
        return users;
    }

    public ArrayList<String> getUserIdList() {
        UserData users = getUserData();
        ArrayList<String> userIdList = new ArrayList<>();
        for (int i = 0; i < users.getData().size(); i++) {
            userIdList.add(users.getData().get(i).getId());
        }
        return userIdList;
    }

    public String getRandomId() {
        Random ran = new Random();
        int x = ran.nextInt(getUserIdList().size() - 1);
        String randomId = getUserIdList().get(x);
        return randomId;
    }


}
