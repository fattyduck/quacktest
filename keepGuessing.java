import java.util.Scanner;

/**
 * Created by fattyduck on 3/14/15.
 */
public class keepGuessing {
    public static void main(String[] args){
       Scanner input =new Scanner(System.in);
        int number=5;
        System.out.println("I have chosen a number between 1 and 10, try to guess it!");
       int guess=input.nextInt();

        while(guess!=number){
           System.out.println("Nope, please guess again!");
            guess=input.nextInt();

        }
        System.out.println("Good guess");


    }
}