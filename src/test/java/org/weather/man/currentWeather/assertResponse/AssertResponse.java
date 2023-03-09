package org.weather.man.currentWeather.assertResponse;

import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;


@Slf4j
public class AssertResponse {
    public static void assertResponseStatusIs(Integer statusCode,Response response) {
        response
                .then()
                .log().ifValidationFails()
                .statusCode(statusCode);
    }
}
