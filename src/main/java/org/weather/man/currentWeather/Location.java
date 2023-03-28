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
public class Location {
            public String name;
            public  String region;
            public  String country;
            public  String lat;
            public  String lon;
            public  String tz_id;
            public String localtime_epoch;
            public String localtime;
}
