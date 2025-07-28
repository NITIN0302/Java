package com.servo.FunctionalInterface;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.*;

public class _FunctionalInterface {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);

        // Function <Input Type, Return Type> name = lambda function
        // This functional interface inout some value and return some
        // value by applying the lambda function
        // Functional Interface are used with map function of stream().
        Function<Integer, Integer> isEven = (n) -> n % 2 == 0 ? n:0;


        // Predicate Interface are used with filter function
        // Predicate <Input Type> name = lambda function
        // Return always the boolean type
        Predicate<Integer> isEven1 = n->n != 0;

        // Consumer Interface are used with function where we don't want to return anything
        Consumer<Integer> printData = msg -> System.out.print(msg + " ");

        // UnaryOperator<Same input and output type>
        UnaryOperator<Integer> square = n -> n*n;

        // BinaryOperator<Input Type and return type would be same> add
        BinaryOperator<Integer> add = (a,b)->a+b;

        Optional<Integer> result = li.stream()
                .map(isEven)
                .filter(isEven1)
                .map(square)
                .reduce(add);

        System.out.println(result.get());

        li.stream()
                .map(isEven)
                .filter(isEven1)
                .map(square)
                .forEach(printData);

    }
}
