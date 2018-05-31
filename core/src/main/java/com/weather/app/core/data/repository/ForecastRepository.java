package com.weather.app.core.data.repository;

import com.weather.app.core.data.entity.Forecast;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Слой работы с БД для прогноза
 */
@Repository
public interface ForecastRepository extends MongoRepository<Forecast, String> {
}
