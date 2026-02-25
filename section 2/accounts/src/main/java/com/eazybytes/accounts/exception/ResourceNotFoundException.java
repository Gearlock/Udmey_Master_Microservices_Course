package com.eazybytes.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue){ //constructor for class
        super(String.format("%s not found with the given input data %s : '%s'", resourceName, fieldName, fieldValue)); //call the super class (runtime exception) with the message as an input
    }
}
