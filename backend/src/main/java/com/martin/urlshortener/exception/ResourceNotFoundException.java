package com.martin.urlshortener.exception;

public class ResourceNotFoundException extends Exception{
    public ResourceNotFoundException(){}
    public ResourceNotFoundException(String message){
        super(message);
    }
}
