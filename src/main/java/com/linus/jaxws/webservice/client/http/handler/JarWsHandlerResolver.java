package com.linus.jaxws.webservice.client.http.handler;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class JarWsHandlerResolver implements HandlerResolver {

    @SuppressWarnings("rawtypes")
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        List<Handler> handlerChain = new ArrayList<Handler>();
        
        handlerChain.add(new SOAPMessageLoggingHandler());
        return handlerChain;
    }

}
