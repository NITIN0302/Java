package com.servo.Serialization;

import java.io.*;

public class Main {

    public static void SerializeClass(User user){
        try {
            FileOutputStream fs = new FileOutputStream("UserInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fs);
            out.writeObject(user);
            out.close();
            fs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static void DeserializeClass(){
        User user = null;
        try {
            FileInputStream fs = new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\Project work\\Bankend\\Java Learning\\UserInfo.ser");
            ObjectInputStream out = new ObjectInputStream(fs);
            user = (User) out.readObject();
            fs.close();
            out.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }

    public static void main(String[] args) {
        User user = new User();
        user.name = "Nitin";
        user.password = "system123#";
        user.sayHello();
        SerializeClass(user);
        DeserializeClass();

    }
}
