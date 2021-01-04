package com.halil.javaPart3.Exceptions;

public class AccountException extends Exception {
    public AccountException(Exception cause){
        super(cause);
    }
}
