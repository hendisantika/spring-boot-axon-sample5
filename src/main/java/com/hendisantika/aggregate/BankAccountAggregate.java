package com.hendisantika.aggregate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/11/21
 * Time: 06.51
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Aggregate
public class BankAccountAggregate {

    @AggregateIdentifier
    private UUID id;
    private BigDecimal balance;
    private String owner;
}
