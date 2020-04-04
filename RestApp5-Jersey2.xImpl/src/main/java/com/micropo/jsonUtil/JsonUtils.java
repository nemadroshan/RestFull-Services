package com.micropo.jsonUtil;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtils {
    public static String convertJavaToJson(Object obj){
        String jsonString = "{}";
        ObjectMapper objectMapper = new ObjectMapper();
        if(obj!=null)
            try {
                jsonString = objectMapper.writeValueAsString(obj);
            }
            catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        return jsonString;
    }

    public static  <T> T convertJsonToJava(String jsonString, Class<T> cls){
        T response =null;
        ObjectMapper objectMapper =  new ObjectMapper();
        try {
            response = objectMapper.readValue(jsonString,cls);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
