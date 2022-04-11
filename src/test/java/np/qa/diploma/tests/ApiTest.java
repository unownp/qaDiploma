package np.qa.diploma.tests;

import np.qa.diploma.helpers.TestHelper;
import np.qa.diploma.models.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static np.qa.diploma.helpers.CustomAllureListener.withCustomTemplates;
import static np.qa.diploma.helpers.Specs.request;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiTest {


    TestHelper testHelper = new TestHelper();


    @DisplayName("Проверка существование юзеров")
    @Test
    void checkUserListExistence() {
        UserData users = testHelper.getUserData();
        assertThat(users.getData().size()).isGreaterThan(0);
    }

    @DisplayName("Проверка постов юзеров")
    @Test
    void checkRandomIdPosts() {
        PostData posts = given()
                .filter(withCustomTemplates())
                .spec(request)
                .pathParam("id", testHelper.getRandomId())
                .when()
                .get("user/{id}/post")
                .then()
                .statusCode(200)
                .log().body()
                .extract().as(PostData.class);
        assertThat(posts.getData().size()).isEqualTo(posts.getTotal());
    }

    @DisplayName("Проверка даты регистрации")
    @Test
    void checkRegistrationRandomId() {
        UserFull userFull = given()
                .filter(withCustomTemplates())
                .spec(request)
                .pathParam("id", testHelper.getRandomId())
                .when()
                .get("user/{id}")
                .then()
                .statusCode(200)
                .log().body()
                .extract().as(UserFull.class);
        assertThat(userFull.getRegisterDate().length()).isGreaterThan(0);
    }

    @DisplayName("Проверка создания нового юзера")
    @Test
    void checkUserCreated() {

        String lastName = "Dvinyatin";
        String firstName = "Fedor";
        String email = testHelper.getRandomEmail();


        NewUser newUser = given()
                .filter(withCustomTemplates())
                .spec(request)
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .body("lastName=" + lastName +
                        "&firstName=" + firstName +
                        "&email=" + email)
                .log().all()
                .when()
                .post("user/create")
                .then()
                //      .statusCode(200)
                .log().body()
                .extract().as(NewUser.class);
        assertThat(newUser.getRegisterDate().length()).isGreaterThan(0);
    }

    @DisplayName("Проверка комментариев")
    @Test
    void checkCommentMessage() {
        CommentData comments = given()
                .filter(withCustomTemplates())
                .spec(request)
                .when()
                .get("comment")
                .then()
                .statusCode(200)
                .log().body()
                .extract().as(CommentData.class);
        assertThat(comments.getData().size()).isGreaterThan(0);
    }

}
