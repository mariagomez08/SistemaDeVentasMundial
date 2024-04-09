package com.crud.crud.exception;
//indicar excepciones globales

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice //esta clase  a detectar todos los errores que se puedan dar dentro del controlador
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)//Nos permite detectar por medio de una excepcion en tiempo de ejecución a estos errores
    public ResponseEntity<String> ResourceNotFoundException(ResourceNotFoundException exception ,
                                                            WebRequest webRequest){

        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);

    }
}
