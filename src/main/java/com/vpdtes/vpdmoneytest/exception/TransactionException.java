package com.vpdtes.vpdmoneytest.exception;

public class TransactionException extends RuntimeException{
    private String errorCode;

    public TransactionException(String message) {
        super(message);
    }

    public TransactionException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
