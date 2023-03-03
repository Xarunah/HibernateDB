package com.example.hibernatedb.resources;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResource {
    // customizing timestamp serialization format
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private Date timestamp;

    private int responseCode;

    private String status;

    private String message;

    public ErrorResource() {
        timestamp = new Date();
    }

    public ErrorResource(HttpStatus httpStatus, String message) {
        this();
        this.responseCode = httpStatus.value();
        this.status = httpStatus.name();
        this.message = message;
    }
}