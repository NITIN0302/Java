package com.servo.Collections;

import java.util.Stack;

public class StackCollection {
    // Stack is not implement by Collection it implements Vector class
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        while(!st.isEmpty()){
            System.out.print(st.peek() + " ");
            st.pop();
        }

    }
}
