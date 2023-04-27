package com.generation.exception;

public class CourseNotFoundException extends Exception{

    public CourseNotFoundException(String message) {
        super(message + " course not found!!");
        
    }//constructor
}//class
