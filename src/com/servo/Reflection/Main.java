package com.servo.Reflection;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {
//        In both case I am creating object of a class
        Cat myCat = new Cat("Mini","Indian"); // By simple method
        Cat myCat1 = Cat.class.getDeclaredConstructor().newInstance(); // By Reflection method



        Field[] catField = myCat.getClass().getFields();

        for(Field field : catField){
            if(field.getName().equals("name")){
                field.setAccessible(true); // To access the private variable
                field.set(myCat,"Mickey");
            }
        }

        Method[] catMethod = myCat.getClass().getDeclaredMethods();

        for(Method method : catMethod){
            if(method.getName().equalsIgnoreCase("meow")){
                method.setAccessible(true);
                method.invoke(myCat);
            }
            else{
                method.invoke(myCat,"Shubham");
            }
        }

    }
}
