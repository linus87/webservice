package com.linus.jaxws.webservice.service;

import javax.jws.WebService;

import com.linus.jaxws.webservice.data.Weather;


/**
 * Only #getWeather() method will exposed, because only #getWeather() has @WebMethod in JaxWsAPIInterface.
 * @author lyan2
 *
 */
@WebService(name="JaxWsAPI", targetNamespace="urn:com:linus:api:components", endpointInterface="com.linus.jaxws.webservice.sei.JaxWsAPIInterface")
public class JaxWsAPI {

    private Weather weather;

    public void setWeather(Weather weather) {
        this.weather = weather;
        System.out.println(this.weather.getHowMuchRain());
    }

    public Weather getWeather() {
        return this.weather;
    }
}
