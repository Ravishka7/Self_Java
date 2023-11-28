package com.ravishka;

import com.ravishka.classes.Student;
import com.ravishka.classes.Teacher;

public class Main {

    public static void main(String[] args) {

        Student john = new Student("John", 18, "123 Street");
        System.out.println("Name: " + john.getName());
        System.out.println("Age: " + john.getAge());
        System.out.println("Address: " + john.getAddress());
        john.display();
        System.out.println();


        Teacher jane = new Teacher("Jane", 25, "456 Street");
        System.out.println("Name: " + jane.getName());
        System.out.println("Age: " + jane.getAge());
        System.out.println("Address: " + jane.getAddress());


    }
}