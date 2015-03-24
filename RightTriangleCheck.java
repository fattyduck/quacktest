/**
 * Created by fattyduck on 3/24/15.
 */
import java.util.Scanner;
public class RightTriangleCheck{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        double side1, side2, base;
        System.out.println("I will tell you the base of a right triangle");
        System.out.println("Side 1 is (height) | of the right triangle and Side 2 is the (hypothenuse) / or \\ of the right Triangle ");
        System.out.print("Side 1: ");
        side1=scan.nextDouble();
        System.out.println();
        System.out.print("Side 2: ");
        side2=scan.nextDouble();
        System.out.println();
        while(side1>=side2){
            System.out.println("Side2(hypothenuse has to be greater than Side1(Height))");
            System.out.println("Try again");
            System.out.print("Side 2: ");
            side2=scan.nextDouble();
        }

        base=Math.sqrt((side2*side2)-(side1*side1));
        System.out.println("The third side (base is )"+ base);
    }
}
