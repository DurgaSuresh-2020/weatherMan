package org.weather.man.currentWeather;

import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CurrentWeatherUtils {

    private CurrentWeatherUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static String getTemperatureInCelsius(Response response) {

        CurrentWeatherResponse  currentWeatherResponse = response.body().as(CurrentWeatherResponse.class);
        return currentWeatherResponse.getCurrent().getTemp_c();
    }

    public static String getTemperatureInFahrenheit(Response response) {

        CurrentWeatherResponse  currentWeatherResponse = response.body().as(CurrentWeatherResponse.class);
        return currentWeatherResponse.getCurrent().getTemp_f();
    }


}
