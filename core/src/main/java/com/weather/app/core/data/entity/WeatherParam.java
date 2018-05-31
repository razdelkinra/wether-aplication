package com.weather.app.core.data.entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Погодные параметры
 */
@Document
public class WeatherParam {

    private int temperature;

    private int preassure;

    private int windSpeed;

    private Precipitation precipitation;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPreassure() {
        return preassure;
    }

    public void setPreassure(int preassure) {
        this.preassure = preassure;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Precipitation getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(Precipitation precipitation) {
        this.precipitation = precipitation;
    }
}
