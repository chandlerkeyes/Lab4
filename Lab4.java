import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Lab4Methods fact = new Lab4Methods();
        long userInput = 0;
        char yOrN = ' ';
        
        do {
            System.out.println("Enter an integer from 1 to 10:");
            userInput = keyboard.nextLong();

            if ((userInput < 1) || (userInput > 10)) {
                System.out.println("You must enter an integer between 1 and 10.");
            } else {
                fact.factorial(userInput);
            }
            System.out.println("Continue? (y/n)");
            yOrN = keyboard.next().charAt(0);
        } while ((yOrN == 'y') || (yOrN == 'Y'));
    }
}

