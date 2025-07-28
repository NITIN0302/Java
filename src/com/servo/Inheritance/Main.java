package com.servo.Inheritance;

public class Main {
    public static void main(String[] args)
    {
        /* ----------- Implmentation of all aspect of com.servo.inheritance ----------- */

        // Private member can not be accessed in child class it means it is not inherited

        /*
            You can create static function with same name into child and parent class but
            it belong to the respective class not the object so here no overriding work
        */

        /*
           1 - Final method and variable are inherited into the child class
           2 - Final method are not redeclared into the child class so their is no possiblity
               of overriding of final method.
         */

         /*
            Final variable will not work as parent class for inheritance
         */

        /*
            Outermost class can not be static because static variable belongs to class
            but their must be a Parent class son inner class can be static but outermost can not.
         */

        /*
            Parent ch = new Child(28,"Father","Doctor",3);

            Here in this declaration what data is accessed will depend on left side of object in
            this case what data will be accessed will depends on "Parent" and Which version of data
            will be accessed depends on right side of declaration here in this case Child.
        */

        Parent ch = new Child(28,"Father","Doctor",3);
        ch.printDetails();
        Child.greeting();
        Parent.greeting();

        /* ----------- End of implmentation of all aspect of com.servo.inheritance ----------- */
    }
}
