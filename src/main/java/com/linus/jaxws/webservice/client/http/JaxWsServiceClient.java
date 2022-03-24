package com.linus.jaxws.webservice.client.http;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import com.linus.jaxws.webservice.sei.JaxWsAPIInterface;

/**
 * 
 * @author lyan2
 *
 */
@WebServiceClient(name="WeatherService")
public class JaxWsServiceClient extends Service {
    
    private final static URL WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(JaxWsServiceClient.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl = JaxWsServiceClient.class.getResource("/");
            logger.info("JaxWS base URL: " + baseUrl);
            url = new URL(baseUrl, "wsdl/JaxWsAPI.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'wsdl/JaxWsAPI.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WSDL_LOCATION = url;
    }

    protected JaxWsServiceClient(URL wsdlDocumentLocation, QName serviceName) {
        super(wsdlDocumentLocation, serviceName);
    }

    public JaxWsServiceClient(URL wsdlDocumentLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlDocumentLocation, serviceName, features);
    }
    
    public JaxWsServiceClient() throws MalformedURLException {
        this(WSDL_LOCATION, new QName("http://service.webservice.jaxws.linus.com", "JaxWsAPIService"));
    }
    
    /**
     * 
     * @return
     *     returns EBayAPIInterface
     */
    @WebEndpoint(name = "WeatherAPI")
    public JaxWsAPIInterface getJaxWsAPI() {
        return super.getPort(new QName("http://service.webservice.jaxws.linus.com", "JaxWsAPI"), JaxWsAPIInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EBayAPIInterface
     */
    @WebEndpoint(name = "WeatherAPI")
    public JaxWsAPIInterface getWeatheryAPI(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.webservice.jaxws.linus.com", "JaxWsAPI"), JaxWsAPIInterface.class, features);
    }

}
