package com.eureka.weather.eurekaweather.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YuAn
 * @Package: com.eureka.weather.eurekaweather.model
 * @auther: YuAn
 * @Date: 2018/10/10
 * @Time: 10:39
 * @Project_name: eureka-weather
 * To change this template use File | Settings | File Templates.
 * @Description:
 */

@Data
public class Weather implements Serializable {

    private static final long serialVersionUID = 1L;

    private Yesterday yesterday;
    private String city;
    private String aqi;
    private String wendu;
    private String ganmao;
    private List<Forecast> forecast;



}
