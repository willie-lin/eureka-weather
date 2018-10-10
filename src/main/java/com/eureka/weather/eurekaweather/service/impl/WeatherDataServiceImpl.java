package com.eureka.weather.eurekaweather.service.impl;

import com.eureka.weather.eurekaweather.model.WeatherResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YuAn
 * @Package: com.eureka.weather.eurekaweather.service.impl
 * @auther: YuAn
 * @Date: 2018/10/10
 * @Time: 11:06
 * @Project_name: eureka-weather
 * To change this template use File | Settings | File Templates.
 * @Description:
 */
@Service
public class WeatherDataServiceImpl implements com.eureka.weather.eurekaweather.service.WeatherDataService {

    @Autowired
    private RestTemplate restTemplate;

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private final String WEATHER_API = "http://wthrcdn.etouch.cn/weather_mini";



    @Override
    public WeatherResponse getDataByCityId(String cityId){
        String uri = WEATHER_API + "cityKey=" + cityId;

      return doGetWeatherDate(uri);
    }

    @Override
    public WeatherResponse getDataByCityName(String cityName){
        String uri = WEATHER_API + "?city=" + cityName;
        return this.doGetWeatherDate(uri);
    }

    private WeatherResponse doGetWeatherDate(String uri){
        ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
        String strBody = null;

        if (response.getStatusCodeValue() == 200) {
            strBody = response.getBody();
        }

        ObjectMapper mapper = new ObjectMapper();
        WeatherResponse weather = null;

        try {
            weather = mapper.readValue(strBody, WeatherResponse.class);
        }catch (IOException e){
            e.printStackTrace();
        }
        return weather;
    }
}
