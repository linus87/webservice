package com.linus.jaxws.webservice.test;

import java.net.MalformedURLException;

import com.linus.api.components.WeatherAPIInterface;
import com.linus.jaxws.webservice.client.http.JaxWsServiceClient;
import com.linus.jaxws.webservice.client.http.handler.JarWsHandlerResolver;
import com.linus.jaxws.webservice.data.Weather;

public class JaxWsServiceClientTest {

    public static void main(String[] args) throws MalformedURLException {
        JaxWsServiceClient client = new JaxWsServiceClient();
        client.setHandlerResolver(new JarWsHandlerResolver());
        
        WeatherAPIInterface api = client.getJaxWsAPI();
        
        Weather weather = new Weather();
        weather.setRain(true);
        weather.setHowMuchRain(100);
        
        api.setWeather(weather);
        
        Weather weather2 = api.getWeather();
        System.out.println(weather2 == null);
    }
}
