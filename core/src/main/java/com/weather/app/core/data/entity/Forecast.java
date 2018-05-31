package com.weather.app.core.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

/**
 * Прогноз
 */
@Document
public class Forecast {

    @Id
    private String id;

    private LocalDate dateForecast;

    private DayPart dayPart;

    private WeatherParam weatherParam;

    private LocalDate forecastedDay;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDateForecast() {
        return dateForecast;
    }

    public void setDateForecast(LocalDate dateForecast) {
        this.dateForecast = dateForecast;
    }

    public DayPart getDayPart() {
        return dayPart;
    }

    public void setDayPart(DayPart dayPart) {
        this.dayPart = dayPart;
    }

    public WeatherParam getWeatherParam() {
        return weatherParam;
    }

    public void setWeatherParam(WeatherParam weatherParam) {
        this.weatherParam = weatherParam;
    }

    public LocalDate getForecastedDay() {
        return forecastedDay;
    }

    public void setForecastedDay(LocalDate forecastedDay) {
        this.forecastedDay = forecastedDay;
    }
}
