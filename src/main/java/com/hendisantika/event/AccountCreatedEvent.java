package com.hendisantika.event;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/11/21
 * Time: 06.42
 */
@Data
public class AccountCreatedEvent {

    private final UUID id;
    private final BigDecimal initialBalance;
    private final String owner;
}
