package com.amayadream.webchat.listener;

import org.slf4j.bridge.SLF4JBridgeHandler;
import org.springframework.web.util.Log4jConfigListener;

import javax.servlet.ServletContextEvent;

@SuppressWarnings("deprecation")
public class LoggerListener extends Log4jConfigListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        installJulToSlf4jBridge();
        super.contextInitialized(event);
    }

    private void installJulToSlf4jBridge(){
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
    }
}
