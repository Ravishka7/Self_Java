import java.util.Scanner;
import javax.swing.JOptionPane;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      double x;
      double y;
      double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("The hypotenuse is: " + z);


        double p = Double.parseDouble(JOptionPane.showInputDialog("Enter side p: "));
        double q = Double.parseDouble(JOptionPane.showInputDialog("Enter side q: "));
        double r = Math.sqrt((p*p) + (q*q));
        JOptionPane.showMessageDialog(null, "The hypotenuse is: " + r);
    }
}