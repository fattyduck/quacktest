package nyc.c4q.disonruan;

/**
 * Created by fattyduck on 3/5/15.
 */
import java.util.Scanner;
//import scanner
public class Addcalc {
    public static void main(String[] args){
        double first, second, third, sum, average;
        Scanner cow=new Scanner(System.in);
        //initialized scanner
        System.out.println("what is the first number?");
        first=cow.nextDouble();
        System.out.println("your first number is " + first);
        System.out.println("what is the second number?");
        second=cow.nextDouble();
        System.out.println("your second number is " + second);
         System.out.println("what is the third number");
        third=cow.nextDouble();
        System.out.println("your third number is " + third);
        sum=first+second+third;
        System.out.print("the sum of your three numbers is (" + first+" ) + (" + second+") + (" +third +") =");
        System.out.printf("%.4f", sum);
        //limited decimals to 4 places (0.0000)
        average = sum / 3;
        System.out.print("\n the average is ");
        System.out.printf("%.4f", average); 
    }

}
