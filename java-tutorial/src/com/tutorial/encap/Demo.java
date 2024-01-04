package com.tutorial.encap;

public class Demo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 25, "IT");
        System.out.println("Name: "+emp1.getName()+ " Age: "+emp1.getAge()+ " Department: "+emp1.getDept());
        System.out.println("After Updating");
        emp1.setDept("Marketing");
        System.out.println("Name: "+emp1.getName()+ " Age: "+emp1.getAge()+ " Department: "+emp1.getDept()); 
    }
}
