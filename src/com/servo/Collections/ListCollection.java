package com.servo.Collections;

import java.util.*;

public class ListCollection{

    // List -> Collection -> Iterator
    // ArrayList -> AbstractList -> AbstractCollection -> Collection -> Iterator
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(50);
        arr.add(20);
        arr.add(10);
        arr.add(40);
        List<Integer> arr1 = new ArrayList<>();
        arr1.addAll(arr);
        arr1.add(70);
        arr.sort(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return -(int)(a - b);
            }
        });

        System.out.println(arr);
        arr1.forEach((ele)->System.out.print(ele + " "));

        ListIterator<Integer> lk = arr.listIterator();

        System.out.println(lk.next());
        System.out.println(lk.next());
        System.out.println(lk.previous());

    }
}
