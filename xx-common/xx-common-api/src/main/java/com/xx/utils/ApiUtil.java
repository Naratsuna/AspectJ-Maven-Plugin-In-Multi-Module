package com.xx.utils;

import com.xx.aspect.MyLog;
import lombok.experimental.UtilityClass;

// lombok annotation
@UtilityClass
public class ApiUtil {


    @MyLog(title = "AspectJ-Maven-Plugin-In-Multi-Module")
    public static String requestApi(String params) {
        // mock send request with params
        // ...
        // mock response
        String response = "Mock Result";
        // return
        return response;
    }

}
