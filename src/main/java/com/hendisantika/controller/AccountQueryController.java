package com.hendisantika.controller;

import com.hendisantika.service.AccountQueryService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/11/21
 * Time: 06.55
 */
@RestController
@RequestMapping(value = "/accounts")
@Api(value = "Bank Account Queries", description = "Bank Account Query Events API")
@AllArgsConstructor
public class AccountQueryController {

    private final AccountQueryService accountQueryService;

    @GetMapping("/{accountId}")
    public CompletableFuture<BankAccount> findById(@PathVariable("accountId") String accountId) {
        return this.accountQueryService.findById(accountId);
    }
}
