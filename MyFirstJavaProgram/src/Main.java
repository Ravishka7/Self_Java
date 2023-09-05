import java.util.Scanner;
import javax.swing.JOptionPane;
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


        //Getting user inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();



        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Hello "+name+".");
        System.out.println("Your age is "+age+"\n");



        //GUI Intro
        String names = JOptionPane.showInputDialog("Enter your name: ");
        int ages = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));

        JOptionPane.showMessageDialog(null, "Hello "+names+".Your age is "+ages+" and your height is "+height+"\n");


    }
}