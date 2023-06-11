package com.project.Medical.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.project.Medical.Controller.PatientErrorResponse;

@RestControllerAdvice
public class PatientRestExceptionHandler 
{
	@ExceptionHandler
	public ResponseEntity<PatientErrorResponse> handleException(PatientNotFoundException e)
	{
		PatientErrorResponse error =new PatientErrorResponse();
		error.setStatusCode(HttpStatus.NOT_FOUND.value());
		error.setDescription(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<PatientErrorResponse>(error,HttpStatus.NOT_FOUND);
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> handleInputException(MethodArgumentNotValidException e)
	{
		Map<String,String> errorMap=new HashMap<>();
		e.getBindingResult().getFieldErrors().forEach(error->{
			errorMap.put(error.getField(), error.getDefaultMessage());
		});
		return errorMap;
	}
	
	@ExceptionHandler
	public ResponseEntity<PatientErrorResponse> handleOtherException(Exception e)
	{
		PatientErrorResponse error =new PatientErrorResponse();
		error.setStatusCode(HttpStatus.BAD_REQUEST.value());
		error.setDescription("The Patient Id should be only Numeric!!!!");
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<PatientErrorResponse>(error,HttpStatus.BAD_REQUEST);
	}
}
