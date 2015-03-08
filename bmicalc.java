package nyc.c4q.disonruan;

/**
 * Created by fattyduck on 3/5/15.
 */
import java.util.Scanner;
//import scanner
public class bmicalc {
    public static void main(String[] args){
        Scanner cow= new Scanner(System.in);
        // initialized scanner
        double height, weight, pound, inch;
        double bmi;
        //initialized variables
        System.out.println("how tall are you in m: ");
        height=cow.nextDouble();
        System.out.println("how much do you weigh in kg: ");
        weight=cow.nextDouble();
        bmi= weight / (height*height);
        //formula for bmi
        System.out.println("your bmi is " +bmi);
        inch= height*39.3701; //formulia to go from M to inches
        pound = weight*2.205; //formula for kg to go to pound
        System.out.println("your height in inches are "+inch+" your weight in pounds are " + pound);

    }
}
