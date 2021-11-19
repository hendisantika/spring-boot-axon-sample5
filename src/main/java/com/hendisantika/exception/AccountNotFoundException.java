package com.hendisantika.exception;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/11/21
 * Time: 06.45
 */
public class AccountNotFoundException extends Throwable {
    public AccountNotFoundException(UUID id) {
        super("Cannot found account number [" + id + "]");
    }
}
