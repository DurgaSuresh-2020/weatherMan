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
public class Current {

            private String last_updated_epoch;
            private String last_updated;
            private String temp_c;
            private String temp_f;
            private String is_day;
            private Condition condition;
}
