// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("John",23,72);
        Human human2 = new Human("Carl",16,55);

        human1.eat();
        human2.drink();

        System.out.println(human1.name+" is "+human1.age+" years old and weighs "+human1.weight+" kg");
        System.out.println(human2.name+" is "+human2.age+" years old and weighs "+human2.weight+" kg");
    }
}