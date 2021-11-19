package com.hendisantika.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/11/21
 * Time: 06.38
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DebitMoneyCommand {

    @TargetAggregateIdentifier
    private UUID accountId;
    private BigDecimal debitAmount;
}
