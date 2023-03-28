package org.weather.man.currentWeather;


import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static org.weather.man.config.EnvConfigFactory.getConfig;

public class CurrentWeatherRequest {
    public static RequestSpecification createWeatherRequest() {
        return RestAssured
                .given()
                .spec(CurrentWeatherSpec.getBasicSpec())
                .queryParam("key",getConfig().getString("API_KEY"))
                .log().ifValidationFails();
    }

    public static RequestSpecification createWeatherRequestWithoutAuth() {
        return RestAssured
                .given()
                .spec(CurrentWeatherSpec.getBasicSpec())
                .log().ifValidationFails();
    }
}
