package com.chhinhua.fullstackbackend.exception;

/**
 * @author Chhin_Hua - 12/03
 **/

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id) {
        super("Could not found the user with id " + id);
    }
}
