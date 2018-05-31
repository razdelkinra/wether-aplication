package com.weather.app.core.yandex;

import com.weather.app.core.data.entity.DayPart;
import com.weather.app.core.data.entity.Forecast;
import com.weather.app.core.data.entity.Precipitation;
import com.weather.app.core.data.entity.WeatherParam;
import com.weather.app.core.yandex.model.WeatherResponse;
import com.weather.app.core.yandex.model.YandexForecast;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Ruslan on 27.05.2018.
 */
@Component
public class YandexConverter {

    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    public static final String DATE_FORMAT = "yyyy-MM-dd";

    public List<Forecast> toEntityForecast(WeatherResponse weatherResponse) {
        List<Forecast> forecasts = new ArrayList<>();
        for (YandexForecast yandexForecast : weatherResponse.getForecasts()) {
            Forecast forecast = new Forecast();
            forecast.setDateForecast(LocalDate.parse(weatherResponse.getNowDate(),
                    DateTimeFormatter.ofPattern(DATE_TIME_FORMAT, Locale.US)));
            forecast.setForecastedDay(LocalDate.parse(yandexForecast.getDate(),
                    DateTimeFormatter.ofPattern(DATE_FORMAT, Locale.US)));
            forecast.setDayPart(DayPart.DAY);
            WeatherParam weatherParam = new WeatherParam();
            if (yandexForecast.getParts().getTempAvg() < 0 &&
                    yandexForecast.getParts().getPrecMM() > 0) {
                weatherParam.setPrecipitation(Precipitation.SNOW);
            } else if (yandexForecast.getParts().getTempAvg() < 0 &&
                    yandexForecast.getParts().getPrecMM() > 0) {
                weatherParam.setPrecipitation(Precipitation.SNOW);
            } else {
                weatherParam.setPrecipitation(Precipitation.DRY);
            }
            weatherParam.setTemperature(yandexForecast.getParts().getTempAvg());
            if (yandexForecast.getHourForecasts() != null &&
                    yandexForecast.getHourForecasts().size() > 0){
                weatherParam.setWindSpeed(yandexForecast.getHourForecasts().get(0).getPressurePa());

            }
            forecast.setWeatherParam(weatherParam);
            forecasts.add(forecast);
        }
        return forecasts;
    }
}
