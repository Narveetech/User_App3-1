package com.narvee.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MissingPathVariableException {

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(NoSuchElementException.class)
	public Map<String, String> handlePathVariableException(NoSuchElementException ex){
		Map<String, String> map= new HashMap<>();
		map.put(ex.getMessage(), "Given id'ed employee is not available");
		return map;
	}
}
