package com.servo.Collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SetCollection {

    static class Student{
        public int hindi;
        public int english;
        public Student(int hindi,int english){
            this.hindi = hindi;
            this.english = english;
        }
    }


    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(4);

        for(Integer a:st){
            System.out.print(a + " ");
        }

        System.out.println();

        Set<Student> st1 = new HashSet<>();
        Student stu = new Student(70,73);
        st1.add(new Student(100,43));
        st1.add(new Student(70,43));
        st1.add(new Student(97,23));
        st1.add(new Student(80,93));
        st1.add(stu);

        System.out.println(st1.contains(new Student(70,73)));
        System.out.println(st1.contains(stu));


    }
}
