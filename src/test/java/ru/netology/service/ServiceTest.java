package ru.netology.service;

import static org.hamcrest.Matchers.*;
//import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class ServiceTest {

@Test
        void shouldBody() {
    //Given - When - Then
// Предусловия
    given()
            .baseUri("https://postman-echo.com")
            .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
            .when()
            .post("/post")
// Проверки
            .then()
            .statusCode(200)
            .body("JsonPath", equalTo(null));
}         ;
}
