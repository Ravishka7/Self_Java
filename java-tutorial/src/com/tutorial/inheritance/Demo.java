package com.tutorial.inheritance;

public class Demo {
    public static void main(String[] args) {
        Samsung s = new Samsung();
        s.setVersion("Lollipop");
        s.setCost(400000);
        s.setColor("White");
        s.setRAM("8GB");

        System.out.println("Samsung Mobile Details: ");
        System.out.println("Version: " +s.getVersion()+ "\n" +
                "Cost: " +s.getCost()+ "\n" +
                "Color: " +s.getColor()+ "\n" +
                "RAM: " +s.getRAM());
    }
}
