package com.tutorial.spring.aop_04._05AllAdvicesWithLog4j.aop;

public class AdderImpl implements Adder {

    public int add(int a, int b){
        System.out.println("AdderImpl.add()............");
        return a+b;
    }
}
