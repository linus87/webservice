package com.linus.jaxws.webservice.data;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace="urn:com:linus:api:components")
public class User {

    private Long userId;
    
    private String mobileNumber;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
