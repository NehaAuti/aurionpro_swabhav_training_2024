package com.aurionpro.model;

import com.aurionpro.exceptions.EmailNotValidException;

import com.aurionpro.model.User;

public class EmailValidator extends User {

    public EmailValidator(String email, String password) {
        super(email, password);
    }

    public void validateEmail() {
        String email = getEmail();
        if (email == null || !email.contains("@") || email.indexOf('@') == email.length() - 1 || email.substring(email.indexOf('@')).indexOf('.') == -1) {
            throw new EmailNotValidException(email);
        }
    }
}


