package com.java.recap2.abstraction;

public class AbDemo {
    public static void main(String[] args) {
        Student student = new Athlete();
        student.study();
        student.exam();
    }
}
