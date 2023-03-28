package org.weather.man.currentWeather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CurrentWeatherResponse {
    public Location location;
    public Current current;
    public String wind_mph;
    public String wind_kph;
    public String wind_degree;
    public String wind_dir;
    public String pressure_mb;
    public String pressure_in;
    public String precip_mm;
    public String precip_in;
    public String humidity;
    public String cloud;
    public String feelslike_c;
    public String feelslike_f;
    public String vis_km;
    public String vis_miles;
    public String uv;
    public String gust_mph;
    public String gust_kph;
}
