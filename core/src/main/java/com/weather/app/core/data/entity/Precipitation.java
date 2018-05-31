package com.weather.app.core.data.entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Виды осадок
 */
@Document
public enum Precipitation {

    RAIN("1", "Дождь"),
    SNOW("2", "Снег"),
    DRY("3", "Без осадков");

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    Precipitation(String id, String description) {
        this.id = id;
        this.description = description;
    }

    private String id;
    private String description;
}
