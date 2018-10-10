package com.eureka.weather.eurekaweather.service;

import com.eureka.weather.eurekaweather.model.WeatherResponse;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.eureka.weather.eurekaweather.service
 * @auther: YuAn
 * @Date: 2018/10/10
 * @Time: 11:24
 * @Project_name: eureka-weather
 * To change this template use File | Settings | File Templates.
 * @Description:
 */
public interface WeatherDataService {
    WeatherResponse getDataByCityId(String cityId);

    WeatherResponse getDataByCityName(String cityName);
}
