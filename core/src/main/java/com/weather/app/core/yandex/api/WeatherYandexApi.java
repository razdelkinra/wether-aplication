package com.weather.app.core.yandex.api;

import com.weather.app.core.yandex.model.WeatherResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Single;

/**
 * Yandex weather API
 */
public interface WeatherYandexApi {

    @GET("forecast")
    Single<WeatherResponse> getWeatherResponse(@Query("geoid") int geoid);
}
