package org.weather.man.currentWeather.currentWeather;

import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.weather.man.currentWeather.CurrentWeatherAPI;
import org.weather.man.currentWeather.CurrentWeatherUtils;

import static org.apache.http.HttpStatus.SC_BAD_REQUEST;
import static org.apache.http.HttpStatus.SC_OK;
import static org.apache.http.HttpStatus.SC_UNAUTHORIZED;
import static org.weather.man.currentWeather.assertResponse.AssertResponse.assertResponseStatusIs;

@Slf4j
public class TestCurrentWeather{
    @Nested
    class Get {
        @Test
        void assertThatCurrentWeatherIsReturnedForValidCityName() {
            String cityName = "Amsterdam" ;
            Response response = CurrentWeatherAPI.getCurrentWeather(cityName);
            assertResponseStatusIs(SC_OK,response);
            AssertCurrentWeather.responseContain(response,cityName);
            log.info("Current Temperature of "+cityName+" in Celsius is : "+ CurrentWeatherUtils.getTemperatureInCelsius(response));
            log.info("Current Temperature of "+cityName+" in Fahrenheit is : "+ CurrentWeatherUtils.getTemperatureInFahrenheit(response));
        }

        @Test
        void assertThatBadRequestIsReturnedForInvalidCityName(){
            Response response = CurrentWeatherAPI.getCurrentWeather("wrongCityName");
            assertResponseStatusIs(SC_BAD_REQUEST,response);
        }

        @Test
        void assertThatUnAuthorisedErrorIsReturnedWithoutAccessKey(){
            Response response = CurrentWeatherAPI.getCurrentWeatherWithoutAuth("Chennai");
            assertResponseStatusIs(SC_UNAUTHORIZED,response);
        }
    }
}
