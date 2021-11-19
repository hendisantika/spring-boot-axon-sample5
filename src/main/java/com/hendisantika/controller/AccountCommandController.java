package com.hendisantika.controller;

import com.hendisantika.service.AccountCommandService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/11/21
 * Time: 06.54
 */
@RestController
@RequestMapping(value = "/accounts")
@Api(value = "Bank Account Commands", description = "Bank Account Commands API")
@AllArgsConstructor
public class AccountCommandController {
    private final AccountCommandService accountCommandService;

}
