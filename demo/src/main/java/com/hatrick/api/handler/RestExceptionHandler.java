package com.hatrick.api.handler;

import com.hatrick.api.error.ResourceNotFoundDetail;
import com.hatrick.api.error.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException (ResourceNotFoundException rfnException){
       ResourceNotFoundDetail rnfDetails =  ResourceNotFoundDetail.Builder.newBuilder()
                .timestamp(new Date().getTime())
                .status(HttpStatus.NOT_FOUND.value())
                .title("Resource not Found")
                .detail(rfnException.getMessage())
                .developerMessage(rfnException.getClass().getName()).build();
       return new ResponseEntity<>(rnfDetails,HttpStatus.NOT_FOUND);
    }
}
