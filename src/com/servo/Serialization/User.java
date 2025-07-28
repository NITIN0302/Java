package com.servo.Serialization;
import java.io.Serializable;

public class User implements Serializable {
    public String name;
    public String password;

    public void sayHello(){
        System.out.println("Hello World");
    }
}
