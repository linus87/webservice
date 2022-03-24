package com.linus.jaxws.webservice.service;

import javax.xml.ws.Provider;
import javax.xml.ws.WebServiceProvider;

import com.linus.jaxws.webservice.data.User;

@WebServiceProvider
public class UserServiceProvider implements Provider<User> {

    public User invoke(User request) {
        // TODO Auto-generated method stub
        return null;
    }

}
