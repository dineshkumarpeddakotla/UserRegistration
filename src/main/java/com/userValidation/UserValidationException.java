package com.userValidation;

public class UserValidationException extends Throwable {
    public exceptionType type;
    public UserValidationException(exceptionType type,String message) {
        super(message);
        this.type=type;
    }
    public enum exceptionType{
        nullInput,
        emptyInput
    }
}
