package org.weather.man.currentWeather;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.weather.man.config.EnvConfigFactory.getConfig;
import static org.weather.man.currentWeather.CurrentWeatherRequest.createWeatherRequest;
import static org.weather.man.currentWeather.CurrentWeatherRequest.createWeatherRequestWithoutAuth;

public class CurrentWeatherAPI {
    private static final String CURRENT_WEATHER_ENDPOINT = getConfig().getString("CURRENT_WEATHER_ENDPOINT");


    public static Response getCurrentWeather(String cityName) {
        RequestSpecification requestSpecification = createWeatherRequest();
        return requestSpecification
                .when()
                .queryParam("q",cityName)
                .get(CURRENT_WEATHER_ENDPOINT)
                .then()
                .log().ifError()
                .extract().response().peek();
    }

    public static Response getCurrentWeatherWithoutAuth(String cityName) {
        RequestSpecification requestSpecification = createWeatherRequestWithoutAuth();
        return requestSpecification
                .when()
                .queryParam("q",cityName)
                .get(CURRENT_WEATHER_ENDPOINT)
                .then()
                .log().ifError()
                .extract().response().peek();
    }

}
