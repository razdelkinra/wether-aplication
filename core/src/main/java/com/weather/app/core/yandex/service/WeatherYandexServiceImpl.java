package com.weather.app.core.yandex.service;

import com.weather.app.core.api.WeatherService;
import com.weather.app.core.data.repository.ForecastRepository;
import com.weather.app.core.yandex.YandexConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rx.schedulers.Schedulers;

/**
 * Created by Ruslan on 27.05.2018.
 */
@Service
public class WeatherYandexServiceImpl implements WeatherService {

    @Autowired
    ApiYandexUtils apiYandexUtils;

    @Autowired
    ForecastRepository forecastRepository;

    @Autowired
    YandexConverter yandexConverter;


    @Override
    public void getWeatherResponse() {
        apiYandexUtils.getApiService().getWeatherResponse(213)
                .subscribeOn(Schedulers.io())
                //.doOnSuccess(albums -> getMusicDao().insertAlbums(albums))
                .onErrorReturn(throwable -> {
                    return null;
                })
                //  .doOnSubscribe(disposable -> mRefresher.setRefreshing(true))
                //.doFinally(() -> mRefresher.setRefreshing(false))
                .subscribe(
                        response -> {
                            forecastRepository.saveAll(yandexConverter.toEntityForecast(response));
                        });
    }
}
