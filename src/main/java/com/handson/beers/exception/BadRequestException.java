package com.handson.beers.exception;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.handson.beers.model.dto.ErrorResponse;
import org.springframework.http.HttpStatus;

public class BadRequestException extends RestException {
    private static final long serialVersionUID = -1789536444347631890L;

    private Set<ErrorResponse> errorResponseList;

    public BadRequestException(ErrorResponse error) {
        this.errorResponseList = Stream.of(error).collect(Collectors.toSet());
    }

    public BadRequestException(Set<ErrorResponse> errorResponseList) {
        this.errorResponseList = errorResponseList;
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.BAD_REQUEST;
    }

    @Override
    public Object getBody() {
        return errorResponseList;
    }
}
