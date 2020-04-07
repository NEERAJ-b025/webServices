package com.neeraj.ws.soapcalculator;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CalcRepository {
    private float value1;
    private float value2;

    @PostConstruct
    public void initData() {
        value1 = 1;
        value2 = 2;
    }

    public float getValue1() {
        return value1;
    }

    public float getValue2() {
        return value2;
    }
}
