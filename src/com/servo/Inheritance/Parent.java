package com.servo.Inheritance;

public class Parent
{
    public static String race;
    public final String ethnicity = "Indian";
    public int age;
    protected String relation;
    public String work;

    static{
        race = "Asian";
    }

    public Parent(int age,String relation,String work){
        this.age = age;
        this.relation = relation;
        this.work = work;
    }

    public void printDetails(){
        System.out.println(this.age + " " + this.relation + " " + this.work);
    }

    public static void greeting(){
        System.out.println("Hello ! This is parent");
    }

    public final void complete(){
        System.out.println("Hello ! This is parent inside complete");
    }

}
