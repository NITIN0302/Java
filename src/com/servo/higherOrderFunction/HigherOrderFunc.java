package com.servo.higherOrderFunction;

import java.util.function.Function;

public class HigherOrderFunc {

    public static Integer process(Integer number, Function<Integer,Integer> operation){
        return operation.apply(number);
    }
    public static void main(String[] args) {
        Function<Integer,Integer> square = num->num*num;
        Integer answer = process(10,square);
        System.out.println(answer);

        Function<Integer,Integer> cube = num->num*num*num;
        Integer result = process(10,cube);
        System.out.println(result);

    }
}
