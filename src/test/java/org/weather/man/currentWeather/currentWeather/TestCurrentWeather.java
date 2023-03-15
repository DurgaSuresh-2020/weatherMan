package org.weather.man.currentWeather.currentWeather;

import io.restassured.response.Response;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.weather.man.currentWeather.CurrentWeatherAPI;

import static org.apache.http.HttpStatus.SC_OK;
import static org.weather.man.currentWeather.assertResponse.AssertResponse.assertResponseStatusIs;

public class TestCurrentWeather{
    @Nested
    class Get {
        @Test
        void assertThatCurrentWeatherIsReturnedForValidCityName() {
            Response response = CurrentWeatherAPI.getCurrentWeather("Amsterdam");
            assertResponseStatusIs(SC_OK,response);
        }

        @Test
        void assertDummyTest() {
            Response response = CurrentWeatherAPI.getCurrentWeather("Amsterdam");
            assertResponseStatusIs(SC_OK,response);
        }
    }
}
