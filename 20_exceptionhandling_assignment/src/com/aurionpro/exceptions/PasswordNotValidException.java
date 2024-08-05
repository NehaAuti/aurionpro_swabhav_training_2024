package com.aurionpro.exceptions;

public class PasswordNotValidException extends RuntimeException {
    private String password;

    public PasswordNotValidException(String password) {
        super();
        this.password = password;
    }

    @Override
    public String getMessage() {
        return "Password must be at least 8 characters long and include one uppercase letter, one special character, and one digit. Provided password: \"" + password + "\"";
    }
}