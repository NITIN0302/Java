package com.servo.Inheritance;

public class Child extends Parent{

    public int age;
    public Child(int age,String relation,String work,int age1){
        super(age,relation,work);
        this.age = age1;
    }

    public void printDetails(){
        System.out.println(super.age + Parent.race + " " + this.relation + " " + this.work + " " + this.age);
    }

    public static void greeting(){
        System.out.println("Hello ! This is child");
    }

    //    Cannot override the final method
    //    public final void complete(){
    //        System.out.println("Hello ! This is parent inside complete");
    //    }
}
