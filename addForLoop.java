/**
 * Created by fattyduck on 4/1/15.
 */
import java.util.Scanner;

public class addForLoop {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Number: ");
        int destination = scan.nextInt();
        int sum=0;
        for (int i = 1; i<= destination; i++){
            sum+=i;
            System.out.print(i + " ");
        }
        System.out.println("\nThe sum is "+sum);
    }
}
