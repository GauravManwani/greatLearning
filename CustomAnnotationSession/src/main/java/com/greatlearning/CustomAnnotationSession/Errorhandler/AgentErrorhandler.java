package com.greatlearning.CustomAnnotationSession.Errorhandler;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class AgentErrorhandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseBody
	public ResponseEntity<List<String>> handle(final MethodArgumentNotValidException ex){
		List<String> list=ex.getBindingResult()
				.getAllErrors().stream()
		.map(fieldErr-> fieldErr.getDefaultMessage())
		.collect(Collectors.toList());
		return new ResponseEntity(list, HttpStatus.BAD_REQUEST);
	}

}
