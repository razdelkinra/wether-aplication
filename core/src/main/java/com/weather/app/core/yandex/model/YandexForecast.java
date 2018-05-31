package com.weather.app.core.yandex.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ruslan on 27.05.2018.
 */
public class YandexForecast {

    @SerializedName("moon_text")
    private String moonText;

    @SerializedName("moon_code")
    private String moonCode;

    private String sunset;

    @SerializedName("parts")
    private DayPart parts;

    @SerializedName("date_ts")
    private String dateTS;

    private String sunrise;

    private String date;

    private String week;

    @SerializedName("hours")
    List<HourForecast> hourForecasts;

    public String getMoonText() {
        return moonText;
    }

    public void setMoonText(String moonText) {
        this.moonText = moonText;
    }

    public String getMoonCode() {
        return moonCode;
    }

    public void setMoonCode(String moonCode) {
        this.moonCode = moonCode;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public DayPart getParts() {
        return parts;
    }

    public void setParts(DayPart parts) {
        this.parts = parts;
    }

    public String getDateTS() {
        return dateTS;
    }

    public void setDateTS(String dateTS) {
        this.dateTS = dateTS;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public List<HourForecast> getHourForecasts() {
        return hourForecasts;
    }

    public void setHourForecasts(List<HourForecast> hourForecasts) {
        this.hourForecasts = hourForecasts;
    }
}
