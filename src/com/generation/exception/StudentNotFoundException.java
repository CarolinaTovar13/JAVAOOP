package com.generation.exception;

public class StudentNotFoundException extends Exception {

    public StudentNotFoundException( String message){
        super( message + " Student not found!" );
        
    }//constructor
}//class
