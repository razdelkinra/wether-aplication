package com.weather.app.core.data.entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Время суток
 */
@Document
public enum DayPart {

    MORNING("1", "Утро"),

    DAY("2", "День"),

    EVENING("3", "Вечер"),

    NIGHT("4", "Ночь");

    DayPart(String id, String description) {
        this.id = id;
        this.description = description;
    }

    private String id;
    private String description;

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
}
