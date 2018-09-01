package com.amayadream.webchat.utils;

import java.util.UUID;

public class StringUtil {

    public static String getGuid(){
        return UUID.randomUUID().toString().trim().replaceAll("-", "").toLowerCase();
    }

}
