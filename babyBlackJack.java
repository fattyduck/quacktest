/**
 * Created by fattyduck on 4/2/15.
 */
import java.util.Random;
public class babyBlackJack {

    public static int Deal(){
        Random rand = new Random();
        int deal=rand.nextInt(11);
        return deal;
    }

    public static void main(String[] args){
        int deal1=Deal();
        int deal2=Deal();
        int total1= deal1+deal2;
        System.out.println("You have been dealed "+ deal1 + " " + deal2);
        System.out.println("Your total is "+total1);
        deal1=Deal();
        deal2=Deal();
        int total2=deal1+deal2;
        System.out.println("The banker has been dealed "+deal1+" "+deal2);
        System.out.println("The bankers total is " + total2);
        if(total1>total2){
            System.out.println("You win");
        }else{
            System.out.println("You lost");
        }


    }
}
