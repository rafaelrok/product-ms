package com.rafaelvieira.productms.services.exceptions;

/**
 * @author Rafael Vieira
 */

public class DataBaseException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DataBaseException(String msg) {
        super(msg);
    }
}
