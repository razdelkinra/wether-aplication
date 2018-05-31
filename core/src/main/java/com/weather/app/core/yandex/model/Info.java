package com.weather.app.core.yandex.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ruslan on 27.05.2018.
 */
public class Info {

    @SerializedName("f")
    private boolean f;
    private boolean n;
    private boolean p;
    private float lat;
    private float lon;
    @SerializedName("geoid")
    private float geoId;
    private String slug;
    private float zoom;
    @SerializedName("tzinfo")
    TimeZone timeZone;
    @SerializedName("def_pressure_mm")
    private float def_pressure_mm;
    @SerializedName("def_pressure_pa")
    private float def_pressure_pa;
    @SerializedName("_h")
    private boolean h;
    private String url;

    public boolean isF() {
        return f;
    }

    public void setF(boolean f) {
        this.f = f;
    }

    public boolean isN() {
        return n;
    }

    public void setN(boolean n) {
        this.n = n;
    }

    public boolean isP() {
        return p;
    }

    public void setP(boolean p) {
        this.p = p;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getGeoId() {
        return geoId;
    }

    public void setGeoId(float geoId) {
        this.geoId = geoId;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public float getZoom() {
        return zoom;
    }

    public void setZoom(float zoom) {
        this.zoom = zoom;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public float getDef_pressure_mm() {
        return def_pressure_mm;
    }

    public void setDef_pressure_mm(float def_pressure_mm) {
        this.def_pressure_mm = def_pressure_mm;
    }

    public float getDef_pressure_pa() {
        return def_pressure_pa;
    }

    public void setDef_pressure_pa(float def_pressure_pa) {
        this.def_pressure_pa = def_pressure_pa;
    }

    public boolean isH() {
        return h;
    }

    public void setH(boolean h) {
        this.h = h;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
