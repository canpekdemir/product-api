package com.craftsmanship.product.api.infrastructure.interceptor;

import com.craftsmanship.product.api.domain.exception.ProductNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Locale;

@RestControllerAdvice
public class RestControllerExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(RestControllerExceptionHandler.class);

    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void handleBalanceNotSufficientException(Locale locale, Exception ex) {
    }
}
