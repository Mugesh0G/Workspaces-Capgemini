package com.example.demo.controller;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.model.FieldErrorMessage;

@ControllerAdvice
public class ExceptionController {
	/*
	 * @ResponseBody
	 * 
	 * @ResponseStatus(HttpStatus.BAD_REQUEST)
	 * 
	 * @ExceptionHandler(ValidationException.class) Exception
	 * exceptionHandler(ValidationException e) { return new
	 * Exception("400",e.getMessage()); }
	 */

}
