package com.weather.app.core.yandex.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ruslan on 27.05.2018.
 */
public class HourForecast {

    private String icon;

    @SerializedName("uv_index")
    private String uvindex;

    @SerializedName("pressure_mm")
    private String pressureMM;

    private String condition;

    @SerializedName("prec_mm")
    private String precMM;

    @SerializedName("soil_temp")
    private String soilTemp;

    @SerializedName("wind_dir")
    private String windDir;

    @SerializedName("pressure_pa")
    private int pressurePa;

    private String hour;

    @SerializedName("wind_speed")
    private String windSpeed;

    @SerializedName("hour_ts")
    private String hourTs;

    @SerializedName("prec_prob")
    private String precProb;

    @SerializedName("soil_moisture")
    private String soilMoisture;

    @SerializedName("wind_gust")
    private String windGust;

    private String humidity;

    private String temp;

    @SerializedName("prec_period")
    private String precPeriod;

    @SerializedName("feels_like")
    private String feelsLike;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUvindex() {
        return uvindex;
    }

    public void setUvindex(String uvindex) {
        this.uvindex = uvindex;
    }

    public String getPressureMM() {
        return pressureMM;
    }

    public void setPressureMM(String pressureMM) {
        this.pressureMM = pressureMM;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getPrecMM() {
        return precMM;
    }

    public void setPrecMM(String precMM) {
        this.precMM = precMM;
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

    public int getPressurePa() {
        return pressurePa;
    }

    public void setPressurePa(int pressurePa) {
        this.pressurePa = pressurePa;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getHourTs() {
        return hourTs;
    }

    public void setHourTs(String hourTs) {
        this.hourTs = hourTs;
    }

    public String getPrecProb() {
        return precProb;
    }

    public void setPrecProb(String precProb) {
        this.precProb = precProb;
    }

    public String getSoilMoisture() {
        return soilMoisture;
    }

    public void setSoilMoisture(String soilMoisture) {
        this.soilMoisture = soilMoisture;
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

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getPrecPeriod() {
        return precPeriod;
    }

    public void setPrecPeriod(String precPeriod) {
        this.precPeriod = precPeriod;
    }

    public String getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(String feelsLike) {
        this.feelsLike = feelsLike;
    }
}
