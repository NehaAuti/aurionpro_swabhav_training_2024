package com.aurionpro.exceptions;

public class EmailNotValidException extends RuntimeException {
    private String email;

    public EmailNotValidException(String email) {
        super();
        this.email = email;
    }

    @Override
    public String getMessage() {
        return "The email address \"" + email + "\" is not valid.";
    }
}