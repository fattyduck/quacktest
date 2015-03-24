/**
 * Created by fattyduck on 3/24/15.
 */
import java.util.Scanner;
public class guessDo {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int number=7;
        int times=1;
        int guess;
        System.out.println("I have a number in mind from 1-20");
        System.out.println("Your guess is?");
        guess=scan.nextInt();
        do{

            System.out.println("That is incorrect, Guess again");
            System.out.println("Your guess is?");
            guess=scan.nextInt();
            times++;
        }while(guess!=number);
        if(guess==number){
            System.out.println("That's right! It took you "+times+" tries");

        }
    }
}
