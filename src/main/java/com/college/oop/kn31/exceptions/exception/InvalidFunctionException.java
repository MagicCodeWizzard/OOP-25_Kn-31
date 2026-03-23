package com.college.oop.kn31.exceptions.exception;

public class InvalidFunctionException extends ArrayIndexOutOfBoundsException {
    public InvalidFunctionException() {
        super();
    }

    public InvalidFunctionException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        String s = super.getMessage();

        return "MY CUSTOM EXCEPTION: " + s;
    }
}
