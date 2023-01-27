package com.jonathan.prices.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private static final String CURRENT_DATE_TIME = LocalDateTime.now().toString();
    private static final String MESSAGE = "Check the list of errors shown above";
    private ResponseEntity<ErrorResponse> handleErrorExceptionsWithErrorList(Exception ex,
                                                                             HttpHeaders headers,
                                                                             HttpStatus status,
                                                                             String errors,
                                                                             String uri) {
        logger.error("An exception occurred!", ex);
        ErrorResponse content = new ErrorResponse(CURRENT_DATE_TIME, status.value(), errors, MESSAGE, uri);
        return new ResponseEntity<>(content, headers, status);
    }

    @ExceptionHandler({ResourceNotFoundException.class})
    public final ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex, HttpServletRequest request) {
        HttpHeaders headers = new HttpHeaders();
        final String error = ex.getError().getErrorMessage();

        return this.handleErrorExceptionsWithErrorList(ex, headers, HttpStatus.NOT_FOUND, error, request.getRequestURI());
    }
}
