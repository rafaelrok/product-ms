package com.rafaelvieira.productms.services.exceptions;

/**
 * @author Rafael Vieira
 */

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}
