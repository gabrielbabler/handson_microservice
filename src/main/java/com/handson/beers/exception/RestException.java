package com.handson.beers.exception;

import org.springframework.http.HttpStatus;

public abstract class RestException extends RuntimeException {

    private static final long serialVersionUID = -6635290010904547786L;

    public abstract HttpStatus getStatus();

    /**
     * If an exception has a response body, it must override this method.
     * 
     * @return response body code
     */
    public Object getBody() {
        return null;
    }
}
