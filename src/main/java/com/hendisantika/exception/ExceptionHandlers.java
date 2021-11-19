package com.hendisantika.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static org.springframework.http.HttpStatus.NOT_FOUND;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/11/21
 * Time: 06.45
 */
@Slf4j
@ControllerAdvice
public class ExceptionHandlers extends ResponseEntityExceptionHandler {

    private static final String REQUESTED_ACCOUNT_NOT_FOUND = "Requested account not found";
    private static final String INSUFFICIENT_BALANCE_EXCEPTION = "Debit operation aborted : Insufficient Balance";

    @ExceptionHandler(AccountNotFoundException.class)
    public ResponseEntity<Object> handleAccountNotFound(AccountNotFoundException ex) {
        log.error(REQUESTED_ACCOUNT_NOT_FOUND);

        return buildResponseEntity(
                new ResponseError(NOT_FOUND, REQUESTED_ACCOUNT_NOT_FOUND)
        );
    }
}
