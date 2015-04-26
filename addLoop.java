/**
 * Created by fattyduck on 3/23/15.
 */
import java.util.Scanner;
public class addLoop {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int total, times, input, addition, x;
        System.out.println("I will add up x amount of numbers for you");
        System.out.println("So how many numbers are you planning to add up?");
        x=scan.nextInt();
        times=0;
        total=0;
        if(x>0){
            while(x!=times){
                System.out.println("Number: ");
                input=scan.nextInt();
                total+=input;
                System.out.println("Total is "+total);
                times++;

            }
        }else{
            System.out.println("So you don't need to add anything together");
        }


    }

}
