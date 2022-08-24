package com.techgeeknext.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class EmployeeControllerTest {

    @Test
    public void testEmpGreetEndpoint() {
        given()
          .when().get("/employee/hello")
          .then()
             .statusCode(200)
             .body(is("Quarkus Example"));
    }

}