package com.eureka.weather.eurekaweather.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.eureka.weather.eurekaweather.config
 * @auther: YuAn
 * @Date: 2018/10/10
 * @Time: 12:06
 * @Project_name: eureka-weather
 * To change this template use File | Settings | File Templates.
 * @Description:
 */
@Configuration
public class RestConfiguration {

    @Autowired
    private RestTemplateBuilder builder;

    @Bean
    public RestTemplate restTemplate() {
        return builder.build();
    }
}
