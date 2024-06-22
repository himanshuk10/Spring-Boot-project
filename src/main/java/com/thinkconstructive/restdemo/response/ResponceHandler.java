package com.thinkconstructive.restdemo.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponceHandler {
    public static ResponseEntity<Object> responseBuilder(
            String message, HttpStatus httpStatus, Object responceObject){
        Map<String, Object> responce = new HashMap<>();
        responce.put("message", message);
        responce.put("httpstatus",httpStatus);
        responce.put("data",responceObject);
        return new ResponseEntity<>(responce,httpStatus);
    }
}
