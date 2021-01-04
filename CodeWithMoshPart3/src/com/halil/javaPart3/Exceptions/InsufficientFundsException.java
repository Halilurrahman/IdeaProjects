package com.halil.javaPart3.Exceptions;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient funds in your account");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
