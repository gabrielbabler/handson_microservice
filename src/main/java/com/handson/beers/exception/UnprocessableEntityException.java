package com.handson.beers.exception;

import com.handson.beers.model.dto.ErrorResponse;
import org.springframework.http.HttpStatus;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UnprocessableEntityException extends RestException {

    private static final long serialVersionUID = 3980240545669347957L;

    private ErrorResponse errorResponseList;

    public UnprocessableEntityException(ErrorResponse errorResponseList) {
        this.errorResponseList = errorResponseList;
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.UNPROCESSABLE_ENTITY;
    }

    @Override
    public Object getBody() {
        return errorResponseList;
    }
}
