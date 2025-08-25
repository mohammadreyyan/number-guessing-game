// NUMBER GUESSING GAME
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = random.nextInt(1,101);
        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between 1 and 100.");
        System.out.print("Enter your guess: ");
        int userGuess = scanner.nextInt();
        
        if(userGuess==numberToGuess){
            System.out.println("🎉 Correct! The number was " + numberToGuess);
        }
        else if(userGuess>numberToGuess){
            System.out.println("Too high! The number was " + numberToGuess);
        }
        else{
            System.out.println("Too low! The number was " + numberToGuess);
        }
        scanner.close();
    }
    
}