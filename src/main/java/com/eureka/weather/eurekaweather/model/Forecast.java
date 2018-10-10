package com.eureka.weather.eurekaweather.model;

import lombok.Data;

import javax.print.attribute.standard.PrinterURI;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Package: com.eureka.weather.eurekaweather.model
 * @auther: YuAn
 * @Date: 2018/10/10
 * @Time: 10:48
 * @Project_name: eureka-weather
 * To change this template use File | Settings | File Templates.
 * @Description:
 */
@Data
public class Forecast implements Serializable {

    private static final long serialVersionUID = 1L;

    private String date;
    private String high;
    private String fengxiang;
    private String low;
    private String fengli;
    private String type;

    public  Forecast(){

    }
}
