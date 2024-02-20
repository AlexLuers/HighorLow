/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package highorlow;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Administrator
 */
public class HighorLow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Random generator = new Random();
        int guess;
        int val = generator.nextInt(10) + 1; 
        
        System.out.println("Guess a number 1-10!");
        if (in.hasNextInt())
        {
            guess = in.nextInt();
            if (guess == val)
            {
                System.out.println("Spot on!");
            }
            else if ((guess) >= val)
            {
                System.out.println("That guess was too high. Try again!");
            }
            else
            {
                System.out.println("That guess was too low, Try again.");
            }
        }
        else
        {
            System.out.println("That is not a valid input. Please try again!");
        }
    }
    
}
