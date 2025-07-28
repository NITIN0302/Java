package com.servo.Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCollection {

    static class Student{
        public int hindi;
        public int english;
        public Student(int hindi,int english){
            this.hindi = hindi;
            this.english = english;
        }
    }
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(int) (o1 - o2);
            }
        });

//        PriorityQueue<Integer> pq1 = new PriorityQueue<>((Integer o1, Integer o2) -> -(int) (o1 - o2));
//        pq1.addAll(pq);

        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.poll();
        }

        List<Student> ls = new ArrayList<>();
        ls.add(new Student(100,43));
        ls.add(new Student(94,42));
        ls.add(new Student(82,57));
        ls.add(new Student(76,94));
        ls.add(new Student(80,73));

        PriorityQueue<Student> pq1 = new PriorityQueue<>((Student o1, Student o2) -> (int) (o1.hindi - o2.hindi));
        pq1.addAll(ls);

        while(!pq1.isEmpty()){
            System.out.println(pq1.peek().hindi);
            pq1.poll();
        }
    }

}
