package com.zts;

import java.util.concurrent.CompletableFuture;

/**
 * @Author zhangtusheng
 * @Date 2022 10 19 22 43
 * @describe：
 **/
public interface DemoService {

    String sayHello(String name);

    default CompletableFuture<String> sayHelloAsync(String name) {
        return CompletableFuture.completedFuture(sayHello(name));
    }
}
