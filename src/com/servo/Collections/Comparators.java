package com.servo.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.sort;

public class Comparators {

    public Comparators(){
        super();
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(8);
        arr.add(4);
        arr.add(5);
        arr.add(2);
        arr.add(0);
        arr.add(11);

        /*
            Comparator function and there is a interface with name Comparator inside this
            interface You have the compare function you override according to your requirement
        */
        Collections.sort(arr,new Comparator<Integer>(){
            @Override
            public int compare(Integer num1,Integer num2){
                return (int) (num1 - num2);
            }
        });

        // Lambda function are one line function act as comparator function.

        arr.forEach((ele)->System.out.print(ele + " "));
    }
}
