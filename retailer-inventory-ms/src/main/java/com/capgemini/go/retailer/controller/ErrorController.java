package com.capgemini.go.retailer.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.go.retailer.exception.EmptyListException;
import com.capgemini.go.retailer.exception.IdNotFoundException;
import com.capgemini.go.retailer.exception.RetailerAlreadyExists;
import com.capgemini.go.retailer.model.ErrorResponse;

@RestControllerAdvice
public class ErrorController {
	@ResponseStatus(code = HttpStatus.CREATED)
	@ExceptionHandler(value = { RetailerAlreadyExists.class })
	public ErrorResponse handleStudentAlreadyExistsException(Exception ex, HttpServletRequest req) {

		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(),
				HttpStatus.BAD_REQUEST.value(), req.getRequestURL().toString());
	}
		@ResponseStatus(code = HttpStatus.CREATED)
		@ExceptionHandler(value = { IdNotFoundException.class })
		public ErrorResponse handleStudentNotEXception(Exception ex, HttpServletRequest req) {

			return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(),
					HttpStatus.BAD_REQUEST.value(), req.getRequestURL().toString());

}
		@ResponseStatus(code = HttpStatus.CREATED)
		@ExceptionHandler(value = { EmptyListException.class })
		public ErrorResponse handleStudentList(Exception ex, HttpServletRequest req) {

			return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(),
					HttpStatus.BAD_REQUEST.value(), req.getRequestURL().toString());

}
}
