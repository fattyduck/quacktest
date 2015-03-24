/**
 * Created by fattyduck on 3/24/15.
 */
import java.util.Scanner;
public class safeSquareRoot {
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number and I will give you the square root");
        int num=scan.nextInt();
        double root=Math.sqrt(num);

        while(num<0){
            System.out.println("You can't take the square root of a negative number, silly");
            System.out.println("Try again!");
            num=scan.nextInt();

        }
        root=Math.sqrt(num);
        if(num>0){
            System.out.println("The square root of "+num+" is "+root);
        }

    }

}
