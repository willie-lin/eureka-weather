package com.eureka.weather.eurekaweather.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author YuAn
 * @Package: com.eureka.weather.eurekaweather.model
 * @auther: YuAn
 * @Date: 2018/10/10
 * @Time: 10:53
 * @Project_name: eureka-weather
 * To change this template use File | Settings | File Templates.
 * @Description:
 */

@Data
public class WeatherResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    //  天气数据

    private Weather data;

    //  消息状态

    private String status;

    //消息描述

    private String desc;

    public WeatherResponse() {
    }
}
