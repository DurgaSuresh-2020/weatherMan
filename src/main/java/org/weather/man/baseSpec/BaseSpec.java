package org.weather.man.baseSpec;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseSpec {

    // Due to a bug in restAssured, we are not using RequestSpecBuilder directly in our getAccessToken method
    // https://github.com/rest-assured/rest-assured/issues/938
    public static RequestSpecification getBasicSpec(String url) {
        return new RequestSpecBuilder()
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .setBaseUri(url)
                .build();
    }

}
