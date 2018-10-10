package com.eureka.weather.eurekaweather.controller;

import com.eureka.weather.eurekaweather.model.WeatherResponse;
import com.eureka.weather.eurekaweather.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.eureka.weather.eurekaweather.controller
 * @auther: YuAn
 * @Date: 2018/10/10
 * @Time: 12:05
 * @Project_name: eureka-weather
 * To change this template use File | Settings | File Templates.
 * @Description:
 */
@RestController
public class WeatherController {

    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/weather/cityId/{cityId}")
    public WeatherResponse getReportByCityId(@PathVariable("cityId") String cityId) {
        return weatherDataService.getDataByCityId(cityId);
    }

    @GetMapping("/weather/cityName/{cityName}")
    public WeatherResponse getReportByCityName(@PathVariable("cityName") String cityName) {
        return weatherDataService.getDataByCityName(cityName);
    }
}
