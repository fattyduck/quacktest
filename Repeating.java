/**
 * Created by fattyduck on 3/23/15.
 */
import java.util.Scanner;
public class Repeating {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("What would you like to print repeatedly?");
        String input=scan.nextLine();
        System.out.println("How many times would you like to print it?");
        int rnum=scan.nextInt();
        int n=0;
        while(n!=rnum){
            System.out.println(input);
            n++;
        }
    }
}
