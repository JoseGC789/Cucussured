package com.joseGC.cucussured.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(annotations = RestController.class)
public class GlobalAdviceHandler{

    @ExceptionHandler({AssertionError.class})
    ResponseEntity<Map<String, String>> handleInvalid(){
        Map<String, String> response = new HashMap<>();
        response.put("Mensaje", "Designador Incorrecto");
        return ResponseEntity.badRequest().body(response);
    }
}
