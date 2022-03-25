package com.linus.api.components;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.linus.jaxws.webservice.data.Weather;

/**
 * @author linus.yan87@gmail.com
 */
@SOAPBinding
@WebService(name="WeatherAPI", targetNamespace="urn:com:linus:api:components")
public interface WeatherAPIInterface {

    @WebMethod(operationName="GetWeather")
    Weather getWeather();
    
    @WebMethod(operationName="SetWeather")
    void setWeather(Weather weather);
}
