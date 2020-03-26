package com.jason.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JasonUtils {
	public static String  javaObjToJason( Object obj ) {
		String jason="{}";
		ObjectMapper mapper = new ObjectMapper();
		try {
			jason = mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jason;
	}
	
	public static <T> T  jasonToJavaObj( String jasonString , Class<T> targetClass ) {
		T response = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			response = mapper.readValue(jasonString, targetClass);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}
}
