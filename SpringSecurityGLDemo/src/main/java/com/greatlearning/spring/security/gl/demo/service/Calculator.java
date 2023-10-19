package com.greatlearning.spring.security.gl.demo.service;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a=a;
        this.b=b;
    }

    public Calculator(){

    }


    public static void main(String[] args) {
        Calculator c=new Calculator();
    }
}
