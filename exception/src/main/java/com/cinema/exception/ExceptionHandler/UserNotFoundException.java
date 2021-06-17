package com.cinema.exception.ExceptionHandler;

public class UserNotFoundException extends RuntimeException {

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
