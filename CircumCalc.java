import java.util.Scanner;

/**
 * Created by fattyduck on 3/4/15.
 */
import java.util.Scanner;
//this is to import java Scanner

public class CircumCalc{

    public static void main(String args[]){

        Scanner diameters = new Scanner(System.in);
        double pie, radius, circumference, radius2, diameter; //initialized doubles
        pie = 3.14;
        radius = .5;
        System.out.println("You can find the circumference of a circle by multiplying the diameter by multiplying the diameter by " + pie);
        System.out.println("You can find the radius of a circle by multiplying the radius by multiplying the diameter by " + radius);
        System.out.println("For Example, type the diameter below:");
        diameter = diameters.nextDouble();
        //this will take the next line input as diameter
        circumference = diameter * pie;
        radius2 = diameter * radius;
        System.out.print("Your Circumference is ");
        System.out.printf("%.4f",circumference);
        /*printf and %.4f will set the decimal places to 4 (0.0000) you can change it to any number of decimals
        *%.3f will changed decimals places to 3 (0.0000), etc
        */
        System.out.println("\nYour radius is " + radius2);
        //btw Silly me is playing with Git

    }
}
