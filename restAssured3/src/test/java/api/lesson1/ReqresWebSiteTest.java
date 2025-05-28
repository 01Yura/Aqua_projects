package api.lesson1;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReqresWebSiteTest {
    public static final String URL = "https://reqres.in";

    @Test
    void checkAvatarAndIdTest() {
        List<UserData> users = given()
                .baseUri(URL)
                .when()
                .contentType(ContentType.JSON)
                .get("/api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
//        Проверка что поле Avatar содержит число из поля Id
        users.forEach(e-> assertTrue(e.getAvatar().contains(e.getId().toString())));
//        Проверка что поле Email заканчивается на reqres.in
        users.forEach(e-> assertTrue(e.getEmail().endsWith("reqres.in")));

/*      Проверка что поле Email заканчивается на reqres.in, но просто используя стрим и allMatch
        assertTrue(users.stream().allMatch(e->e.getEmail().endsWith("reqres.in")));

        Проверка что поле Avatar содержит число из поля Id, но мы создаем списки со значениями из этих полей и
        сравниваем соответствующие элементы в каждом списке
        List<String> avatars = users.stream().map(UserData::getAvatar).toList();
        List<String> ids = users.stream().map(e->e.getId().toString()).toList();
        for (int i = 0; i < avatars.size(); i++) {
            assertTrue(avatars.get(i).contains(ids.get(i)));
        }
*/
//        test test test
    }
}
