package com.example.hibernatedb.exceptions;

import com.example.hibernatedb.resources.ErrorResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;


/**
 * Controller advice to handle global exceptions.
 * */
@ControllerAdvice
class CustomControllerAdvice {

    // fallback method when exception is ResponseStatusException or its child exceptions, and return
    // Status 404(NOT_FOUND)
    @ExceptionHandler({ResponseStatusException.class}) // exception handled
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorResource> handleResponseStatusException(ResponseStatusException e) {
        //potential custom logic
        HttpStatus status = HttpStatus.NOT_FOUND; // 404

        return new ResponseEntity<>(new ErrorResource(
                        status, e.getReason()), status);
    }
    // fallback method when exception is Exception or its child exceptions, and return
    // Status 500(INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class) // exception handled
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ErrorResource> handleExceptions(
            Exception e) {
        //potential custom logic
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR; // 500
        //When ResponseStatusException is thrown
        if (e instanceof ResponseStatusException){
            ResponseStatusException responseStatusException = (ResponseStatusException) e;
            return new ResponseEntity<>(
                    new ErrorResource(
                            status,
                            responseStatusException.getReason()), status);
        }
        return new ResponseEntity<>(
                new ErrorResource(
                        status,
                        e.getMessage()), status);
    }
}