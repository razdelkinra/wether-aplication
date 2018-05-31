package com.weather.app.core.yandex.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ruslan on 27.05.2018.
 */
public class WeatherResponse {

    @SerializedName("now")
    private String nowLong;

    @SerializedName("now_dt")
    private String nowDate;

    @SerializedName("info")
    private Info info;

    @SerializedName("fact")
    private Fact fact;

    @SerializedName("forecasts")
    List<YandexForecast> forecasts;

    public String getNowLong() {
        return nowLong;
    }

    public void setNowLong(String nowLong) {
        this.nowLong = nowLong;
    }

    public String getNowDate() {
        return nowDate;
    }

    public void setNowDate(String nowDate) {
        this.nowDate = nowDate;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Fact getFact() {
        return fact;
    }

    public void setFact(Fact fact) {
        this.fact = fact;
    }

    public List<YandexForecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<YandexForecast> forecasts) {
        this.forecasts = forecasts;
    }
}
