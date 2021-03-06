package com.github.idkp.douglas.instantiation;

public class InstantiationException extends ReflectiveOperationException {
    public InstantiationException(String message) {
        super(message);
    }

    public InstantiationException(String message, Throwable cause) {
        super(message, cause);
    }
}