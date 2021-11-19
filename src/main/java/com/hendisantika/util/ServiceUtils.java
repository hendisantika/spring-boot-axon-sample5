package com.hendisantika.util;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/11/21
 * Time: 06.35
 */
public class ServiceUtils {

    public static UUID formatUuid(String accountId) {
        accountId = accountId.replace("-", "");
        String formatted = String.format(
                accountId.substring(0, 8) + "-" +
                        accountId.substring(8, 12) + "-" +
                        accountId.substring(12, 16) + "-" +
                        accountId.substring(16, 20) + "-" +
                        accountId.substring(20, 32)
        );
        return UUID.fromString(formatted);
    }
}
