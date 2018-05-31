package com.weather.app.web;

import com.weather.app.core.data.repository.ForecastRepository;
import com.weather.app.core.yandex.service.WeatherYandexServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Razdelkin Ruslan
 */
@RequestMapping("/weather")
@Controller
public class HomeController {

    private ForecastRepository forecastRepository;

    public HomeController(ForecastRepository hotelRepository) {
        this.forecastRepository = forecastRepository;
    }

    @Autowired
    WeatherYandexServiceImpl weatherYandexService;

    @RequestMapping("/")
    public String home(Model model) {
        weatherYandexService.getWeatherResponse();
        return "error";
    }
}
