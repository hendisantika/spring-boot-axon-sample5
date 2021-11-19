package com.hendisantika.projection;

import com.hendisantika.repository.BankAccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.queryhandling.QueryUpdateEmitter;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/11/21
 * Time: 06.42
 */
@Slf4j
@RequiredArgsConstructor
@Component
public class BankAccountProjection {

    private final BankAccountRepository repository;
    private final QueryUpdateEmitter updateEmitter;


}
