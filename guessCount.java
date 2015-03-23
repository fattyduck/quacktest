/**
 * Created by fattyduck on 3/23/15.
 */
import java.util.Scanner;
import java.util.Random;
public class guessCount {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        Random rand=new Random();
        int num=rand.nextInt(20);
        System.out.println("I have a number in mind from 1-20, try to guess it");
        int guess=scan.nextInt();
        int times=1;

        while(num!=guess){
            System.out.println("nope, guess again");
            guess=scan.nextInt();
            times++;
            if(num==guess){
                if(times<3){
                    System.out.println("You are good guesser it only took you "+times+" tries");
                }else if(times>3&&times<5){
                    System.out.println("You are decent guesser it took you "+times+" tries");
                }else if(times>5){
                    System.out.println("You are bad guesser it took you "+times+" tries");
                }
            }
        }


    }
}
