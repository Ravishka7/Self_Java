// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("I love Pizza");
        System.out.println("It's my favorite food\n");

        int x;//declaration
        x = 5;//assignment
        System.out.println(x);

        int y = 10;//initialization
        System.out.println(y);

        System.out.println(x + y);
        System.out.println("First number is "+x+" and second number is "+y+"\n");



        //swapping variables
        String a = "water";
        String b = "juice";
        String temp;

        System.out.println("Before swapping: a = "+a+" and b = "+b);

        //Suppose there are 3 glasses named a,b and temp.
        temp = a; // First we pour a into temp.
        a = b;//Then we pour b into a.
        b = temp;// Finally, we pour temp into b.

        System.out.println("After swapping: a = "+a+" and b = "+b+"\n");
    }
}