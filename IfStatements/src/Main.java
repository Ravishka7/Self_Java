import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = input.nextInt();

        if(age >= 18){
            System.out.println("You are eligible to vote");
        }
        else if(age < 0){
            System.out.println("You are not in this world!!!");
        }
        else{
            System.out.println("You are not eligible to vote");
        }

        int marks = Integer.parseInt(JOptionPane.showInputDialog("Enter your marks: "));
        if(marks >= 80){
            JOptionPane.showMessageDialog(null, "You got A+");
        }
        else if(marks >= 70){
            JOptionPane.showMessageDialog(null, "You got A");
        }
        else if(marks >= 60){
            JOptionPane.showMessageDialog(null, "You got A-");
        }
        else if(marks >= 50){
            JOptionPane.showMessageDialog(null, "You got B");
        }
        else if(marks >= 40){
            JOptionPane.showMessageDialog(null, "You got C");
        }
        else if(marks >= 33){
            JOptionPane.showMessageDialog(null, "You got D");
        }else if (marks < 0){
            JOptionPane.showMessageDialog(null, "Did you eat the paper!!!");
        }
        else{
            JOptionPane.showMessageDialog(null, "You got F");
        }


    }
}