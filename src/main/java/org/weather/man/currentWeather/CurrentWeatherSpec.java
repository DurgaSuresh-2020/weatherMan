package org.weather.man.currentWeather;
import io.restassured.specification.RequestSpecification;
import org.weather.man.baseSpec.BaseSpec;

import static org.weather.man.config.EnvConfigFactory.getConfig;

public class CurrentWeatherSpec {
   private static final String BASE_URL = getConfig().getString("BASE_URL");

    public static RequestSpecification getBasicSpec() {
        return BaseSpec.getBasicSpec(BASE_URL);
    }
}
