package com.servo.FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {

    public static void main(String[] args) throws IOException {
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.println("Enter the letters");
            int letter = isr.read();
            while(isr.ready()){
                letter = isr.read();
            }
            isr.close();
            System.out.println(letter);
        }
        System.out.println();
        //Byte to char Stream and then reading that Stream
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println(br.readLine());
        }catch (Exception ex){}

    }
}
