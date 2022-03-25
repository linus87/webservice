package com.linus.jaxws.webservice.service;

import javax.jws.WebService;

import com.linus.jaxws.webservice.data.Weather;


/**
 * <p>How to generate WSDL and source files: <br/>
 * <code>cd target/classes</code>
 * <code>wsgen -cp . com.linus.jaxws.webservice.service.WeatherAPI -wsdl -r ../../src/main/resources/wsdl -s ../../src/test/java</code>
 * </p>
 * <p>explanation: Generate WSDL and XSD files into src/main/resources/wsdl directory, and java source files into src/test/java directory</p>
 *
 */
@WebService(serviceName="JaxWsAPIService", portName="WeatherAPI", targetNamespace="urn:com:linus:api:components", endpointInterface="com.linus.api.components.WeatherAPIInterface")
public class WeatherAPI {

    private Weather weather;

    public void setWeather(Weather weather) {
        this.weather = weather;
        System.out.println(this.weather.getHowMuchRain());
    }

    public Weather getWeather() {
        return this.weather;
    }
}
