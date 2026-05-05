package com.tuliosploradori.events.controller;

import com.tuliosploradori.events.dto.ErrorDTO;
import com.tuliosploradori.events.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorDTO> handlerNotFoundException(NotFoundException e) {
        return ResponseEntity.status(404).body(new ErrorDTO(e.getMessage()));
    }
}
