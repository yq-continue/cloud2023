package com.atyang.service;

import org.springframework.stereotype.Component;

/**
 * @author yang
 * @create 2023-05-12 17:18
 */
@Component
public class FallBack implements PaymentService {


    @Override
    public String Hystrix_OK() {
        return "dsadasdas";
    }

    @Override
    public String Hystrix_TimeOut() {
        return null;
    }

    @Override
    public String fallback(int time) {
        return "error test fallback /(ㄒoㄒ)/~~";
    }
}
