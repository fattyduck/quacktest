/**
 * Created by fattyduck on 3/23/15.
 */
import java.util.Scanner;
import java.util.Random;
public class keepGuess {

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        Random rand = new Random();
        int random=rand.nextInt(10);
        System.out.println("I have a number in mind from 1-10, try to guess the number");
        int guess=input.nextInt();
        while(guess!=random){
            System.out.println("Incorrect please guess again.");
            guess=input.nextInt();
            if(guess==random){
                System.out.println("Yes the number is "+guess);
            }
        }
    }
}
