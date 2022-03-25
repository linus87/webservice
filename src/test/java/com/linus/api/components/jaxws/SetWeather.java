
package com.linus.api.components.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "SetWeather", namespace = "urn:com:linus:api:components")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetWeather", namespace = "urn:com:linus:api:components")
public class SetWeather {

    @XmlElement(name = "arg0", namespace = "")
    private com.linus.jaxws.webservice.data.Weather arg0;

    /**
     * 
     * @return
     *     returns Weather
     */
    public com.linus.jaxws.webservice.data.Weather getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.linus.jaxws.webservice.data.Weather arg0) {
        this.arg0 = arg0;
    }

}
