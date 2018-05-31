package com.weather.app.core.yandex.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ruslan on 27.05.2018.
 */
public class Fact {

    @SerializedName("obs_time")
    private String obsTime;

    private String polar;

    private String icon;

    @SerializedName("pressure_mm")
    private String pressureMM;

    @SerializedName("uv_index")
    private String uvIndex;

    private String condition;

    @SerializedName("soil_temp")
    private String soilTemp;

    @SerializedName("wind_dir")
    private String windDir;

    @SerializedName("pressure_pa")
    private String pressurePa;

    @SerializedName("wind_speed")
    private String windSpeed;

    @SerializedName("accum_prec")
    private AccumPrec accumPrec;

    @SerializedName("soil_moisture")
    private String soilMoisture;

    private String daytime;

    @SerializedName("wind_gust")
    private String windGust;

    private String humidity;

    private String source;

    private String season;

    private String temp;

    @SerializedName("feels_like")
    private String feelsLike;


    public String getObsTime() {
        return obsTime;
    }

    public void setObsTime(String obsTime) {
        this.obsTime = obsTime;
    }

    public String getPolar() {
        return polar;
    }

    public void setPolar(String polar) {
        this.polar = polar;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPressureMM() {
        return pressureMM;
    }

    public void setPressureMM(String pressureMM) {
        this.pressureMM = pressureMM;
    }

    public String getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getSoilTemp() {
        return soilTemp;
    }

    public void setSoilTemp(String soilTemp) {
        this.soilTemp = soilTemp;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public String getPressurePa() {
        return pressurePa;
    }

    public void setPressurePa(String pressurePa) {
        this.pressurePa = pressurePa;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public AccumPrec getAccumPrec() {
        return accumPrec;
    }

    public void setAccumPrec(AccumPrec accumPrec) {
        this.accumPrec = accumPrec;
    }

    public String getSoilMoisture() {
        return soilMoisture;
    }

    public void setSoilMoisture(String soilMoisture) {
        this.soilMoisture = soilMoisture;
    }

    public String getDaytime() {
        return daytime;
    }

    public void setDaytime(String daytime) {
        this.daytime = daytime;
    }

    public String getWindGust() {
        return windGust;
    }

    public void setWindGust(String windGust) {
        this.windGust = windGust;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(String feelsLike) {
        this.feelsLike = feelsLike;
    }
}
