/**
 * Created by fattyduck on 3/24/15.
 */
import java.util.Random;
import java.util.Scanner;

public class flipCoin {
    public static void main(String[] args){
        Random rand=new Random();
        Scanner scan=new Scanner(System.in);
        String[] coin={" HEADS"," TALES"};
        String input;
        int chance=rand.nextInt(2);
        do{
            System.out.println("You flipped a coin and it is..."+coin[chance]);
            System.out.println("Would you like to flip again(y or n)");
            input= scan.nextLine();

        }while(input.equals("y"));
    }
}
