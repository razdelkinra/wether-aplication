package com.weather.app.core.yandex.model;

/**
 * Created by Ruslan on 27.05.2018.
 */
public class TimeZone {

    private float offset;
    private String name;
    private String abbr;
    private boolean dst;

    public float getOffset() {
        return offset;
    }

    public void setOffset(float offset) {
        this.offset = offset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public boolean isDst() {
        return dst;
    }

    public void setDst(boolean dst) {
        this.dst = dst;
    }
}
