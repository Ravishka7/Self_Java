// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Color: " + myCar.color);
        System.out.println("Price: " + myCar.price);

        myCar.drive();
        myCar.brake();

    }
}