package com.servo.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Stream API user functional interface concept to make the code more
        // readeable and clear

        List<Integer> li = new ArrayList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6);
        li.add(7);
        li.add(8);
        li.add(9);
        li.add(10);

        // Filter method

        List<Integer> li2 = li.stream().filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(li2);

        // Maps method
        // Uses functional interface to apply the condition on which I want to modify this list
        Function<Integer, Integer> increment = num -> num + 1;
        List<Integer> li3 = li.stream().map(increment)
                .collect(Collectors.toList());
        System.out.println(li3);

        // forEach method
        li.stream().map(num -> num + " ")
                .collect(Collectors.toList())
                .forEach(System.out::print);
        System.out.println();

        // Reduce method
        Optional<Integer> result = li.stream().reduce((num1, num2) -> num1 + num2);
        System.out.println(result.get());

        //Sort method
        List<Integer> li4 = li.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toUnmodifiableList());
        System.out.println(li4);

        //Distinct method
        li.add(10);
        List<Integer> li5 = li.stream().distinct().collect(Collectors.toUnmodifiableList());
        System.out.println(li5);
        li = li5;

        // Limit method
        List<Integer> li6 = li.stream().limit(3).collect(Collectors.toUnmodifiableList());
        System.out.println(li6);

        // Skip method
        List<Integer> li7 = li.stream().skip(3).collect(Collectors.toUnmodifiableList());
        System.out.println(li7);

        //Count Method
        long count = li.stream().count();
        System.out.println(count);

    }
}
