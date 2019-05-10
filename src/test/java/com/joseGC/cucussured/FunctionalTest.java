package com.joseGC.cucussured;

import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.LocalServerPort;
import java.util.HashMap;
import java.util.Map;

public abstract class FunctionalTest {
    @LocalServerPort
    protected int port;
    protected Response response;
    protected Map<String, String> headers = new HashMap<>();
    protected Map<String, String> pathVariables = new HashMap<>();
    protected Map<String, String> queryParameters = new HashMap<>();

    protected String testForNull(String str){
        return "null".equals(str) ? null : str;
    }
}
