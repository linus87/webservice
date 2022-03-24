package com.linus.jaxws.webservice.sei;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.linus.jaxws.webservice.data.Weather;

@WebService
public interface JaxWsAPIInterface {

    @WebMethod
    Weather getWeather();
    
    @WebMethod
    void setWeather(Weather weather);
}
