package com.servo.Collections;
import java.util.*;
public class QueueCollection
{
    // Queue -> Collection -> Iterator
    // LinkedList -> List -> Collection -> Iterator

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(q.peek()); // return top element from queue
        System.out.println(q.poll()); // remove and return top element from queue
        System.out.println(q.isEmpty()); // return true if q is empty


        // Implement deque using arrayDeque

        Deque<Integer> dp = new ArrayDeque<>();
        dp.offerFirst(10);
        dp.offerLast(20);
        dp.addFirst(30);
        dp.addLast(40);

        System.out.println(dp.pollFirst());
        System.out.println(dp.pollLast());
        System.out.println(dp.peekLast());
        System.out.println(dp.peekFirst());

        dp.forEach((ele)->System.out.print(ele + " "));

        // Implementation of priority_queue

        System.out.println();


    }
}
