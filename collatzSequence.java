/**
 * Created by fattyduck on 3/24/15.
 */
import java.util.Scanner;
public class collatzSequence {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Starting number");
        int n=scan.nextInt();

        while(n!=1){
            if(n%2==0){
             n=n/2;
            }else{
                n=3*n+1;
            }
            System.out.print(n+" ");
        }



    }
}
