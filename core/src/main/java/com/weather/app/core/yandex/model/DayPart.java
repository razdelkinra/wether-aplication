package com.weather.app.core.yandex.model;

import com.google.gson.annotations.SerializedName;

/**
 * прогноз по части дня
 */
public class DayPart {

    private String polar;

    private String icon;

    @SerializedName("uv_index")
    private String uvIndex;

    @SerializedName("pressure_mm")
    private int pressureMM;

    @SerializedName("_source")
    private String source;

    private String condition;

    @SerializedName("prec_mm")
    private int precMM;

    @SerializedName("soil_temp")
    private int soilTemp;

    @SerializedName("pressure_pa")
    private int pressurePa;

    @SerializedName("wind_dir")
    private String windDir;

    @SerializedName("wind_speed")
    private double windSpeed;

    @SerializedName("prec_prob")
    private int precProb;

    @SerializedName("soil_moisture")
    private String soilMoisture;

    private String daytime;

    @SerializedName("wind_gust")
    private String windGust;

    private String humidity;

    @SerializedName("temp_max")
    private int tempMax;

    @SerializedName("temp_avg")
    private int tempAvg;

    @SerializedName("temp_min")
    private int tempMin;

    @SerializedName("prec_period")
    private String precPeriod;

    @SerializedName("feels_like")
    private String feelsLike;

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

    public String getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }

    public int getPressureMM() {
        return pressureMM;
    }

    public void setPressureMM(int pressureMM) {
        this.pressureMM = pressureMM;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getPrecMM() {
        return precMM;
    }

    public void setPrecMM(int precMM) {
        this.precMM = precMM;
    }

    public int getSoilTemp() {
        return soilTemp;
    }

    public void setSoilTemp(int soilTemp) {
        this.soilTemp = soilTemp;
    }

    public int getPressurePa() {
        return pressurePa;
    }

    public void setPressurePa(int pressurePa) {
        this.pressurePa = pressurePa;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getPrecProb() {
        return precProb;
    }

    public void setPrecProb(int precProb) {
        this.precProb = precProb;
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

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getTempAvg() {
        return tempAvg;
    }

    public void setTempAvg(int tempAvg) {
        this.tempAvg = tempAvg;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
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
