package com.example.Advivce;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserException {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleMethodArgument(MethodArgumentNotValidException error)
	{
		Map<String, String> errormap=new HashMap<>();
		error.getBindingResult().getFieldErrors().forEach(e->{
			errormap.put(e.getField(), e.getDefaultMessage());
		});
		return errormap;
		}
	}


