package org.weather.man.currentWeather.currentWeather;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.weather.man.currentWeather.CurrentWeatherResponse;


public class AssertCurrentWeather {
    public static void responseContain(Response response,String cityName) {
        CurrentWeatherResponse currentWeatherResponse = response.body().as(CurrentWeatherResponse.class);

        Assertions.assertAll("Current Weather Response: "
                , () -> Assertions.assertEquals(cityName,currentWeatherResponse.getLocation().getName())
                , () -> Assertions.assertFalse(currentWeatherResponse.getCurrent().getTemp_c().isBlank(),"Temperature in Celsius in "+cityName+" is : " + currentWeatherResponse.getCurrent().getTemp_c())
                , () -> Assertions.assertFalse(currentWeatherResponse.getCurrent().getTemp_f().isBlank(),"Temperature in Fahrenheit in "+cityName+" is : " + currentWeatherResponse.getCurrent().getTemp_f()))
        ;
    }
}
