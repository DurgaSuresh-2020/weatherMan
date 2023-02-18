package org.weather.man.currentWeather;


import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class CurrentWeatherRequest {
    public static RequestSpecification createLocationsRequest() {
        return RestAssured
                .given()
                .spec(CurrentWeatherSpec.getBasicSpec())
                .log().ifValidationFails();
    }
}
