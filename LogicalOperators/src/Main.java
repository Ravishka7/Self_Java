import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        temp = input.nextInt();

        if(temp>=30){
            System.out.println("It's hot outside");
        }
        else if(temp>=20 && temp<25){
            System.out.println("It's warm outside");
        }
        else if(temp>=10 && temp<20){
            System.out.println("It's cold outside");
        }
        else if(temp>=0 && temp<10){
            System.out.println("It's very cold outside");
        }
        else{
            System.out.println("It's freezing outside");
        }





        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("You quit the game");
        }
        else{
            System.out.println("You are still playing the game");
        }






        Scanner scanner2 = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response2 = scanner2.next();

        if(!response2.equals("q") && !response2.equals("Q")){
            System.out.println("You are still playing the game");
        }
        else{
            System.out.println("You quit the game");
        }

    }
}