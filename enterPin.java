/**
 * Created by fattyduck on 3/14/15.
 */
import java.util.Scanner;
public class enterPin {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
    int pin=12345;
        System.out.println("Welcome to bank of Cowlings");
        System.out.println("Enter your pin below");
        int entry=in.nextInt();
        while(entry!=pin){
            System.out.println("Sorry wrong pin, please try again.");
            entry=in.nextInt();
        }
            System.out.println("You have successfully logged in");
        }
    }

