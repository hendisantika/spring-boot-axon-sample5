package com.hendisantika.service;

import lombok.AllArgsConstructor;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/11/21
 * Time: 06.36
 */
@Service
@AllArgsConstructor
public class AccountCommandService {
    private final CommandGateway commandGateway;

}
