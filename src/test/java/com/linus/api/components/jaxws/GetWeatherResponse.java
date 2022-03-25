
package com.linus.api.components.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "GetWeatherResponse", namespace = "urn:com:linus:api:components")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWeatherResponse", namespace = "urn:com:linus:api:components")
public class GetWeatherResponse {

    @XmlElement(name = "return", namespace = "")
    private com.linus.jaxws.webservice.data.Weather _return;

    /**
     * 
     * @return
     *     returns Weather
     */
    public com.linus.jaxws.webservice.data.Weather getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.linus.jaxws.webservice.data.Weather _return) {
        this._return = _return;
    }

}
