package com.hendisantika.dto;


import lombok.Value;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/11/21
 * Time: 06.34
 */
@Value
public class AccountCreationDTO {
    private final BigDecimal initialBalance;
    private final String owner;
}
