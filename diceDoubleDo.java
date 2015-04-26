/**
 * Created by fattyduck on 3/24/15.
 */
import java.util.Random;

public class diceDoubleDo {
    public static void main(String[] args){
        Random rand=new Random();
        int roll1, roll2, total;

        do{
            roll1=rand.nextInt(6);
            roll2=rand.nextInt(6);
            total=roll1+roll2;
            System.out.println("Roll#1 is "+roll1);
            System.out.println("Roll#2 is "+roll2);
            System.out.println("Total is "+total);
            System.out.println();



        }while(roll1!=roll2);

    }
}
