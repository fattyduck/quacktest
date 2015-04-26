/**
 * Created by fattyduck on 3/23/15.
 */
import java.util.Scanner;
public class pinLock {
    public static void main(String[] args){
        Scanner cow=new Scanner(System.in);
        int pin=12345;
        int tries=0;
        System.out.println("Enter your pin");
        int userin=cow.nextInt();
        tries+=1;
        while(userin!=pin){
            System.out.println("INCORRECT PIN PLEASE TRY AGAIN");
            System.out.println("Enter your pin");
            userin=cow.nextInt();
            tries++;
            if(tries>=5){
                System.out.println("Sorry you have been locked out");
                break;
            }
        }
        if(userin==pin){
            System.out.println("Welcome to bank of cows");
        }
    }
}
