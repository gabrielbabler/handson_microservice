package com.handson.beers.exception;

import org.springframework.http.HttpStatus;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NotFoundException extends RestException {

    private static final long serialVersionUID = -4546342692615580312L;

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.NOT_FOUND;
    }

}
