/**
 * Created by fattyduck on 3/14/15.
 */
import java.util.Random;
public class diceGame {
    public static void main(String[]args){
        Random rand=new Random();
        System.out.println("Here comes the roll");
        int roll1, roll2, roll3, roll4;
        roll1=rand.nextInt(7);
        roll2=rand.nextInt(7);
        roll3=rand.nextInt(7);
        roll4=rand.nextInt(7);
        System.out.println("Roll #1: " + roll1);
        System.out.println("Roll #2: " + roll2);
        System.out.println("The total is " + (roll1+roll2));
        System.out.println("\nRoll #1: " + roll3);
        System.out.println("Roll #2: " + roll4);
        System.out.println("The total is " + (roll3+roll4));

                }

            }

