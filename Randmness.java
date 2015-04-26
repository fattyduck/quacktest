/**
 * Created by fattyduck on 3/14/15.
 */
import java.util.Random;
public class Randmness {
    public static void main(String[] args){
       Random rand=new Random();
        int x=1+rand.nextInt(100);
        System.out.println("My random number is "+x );
        System.out.println("Here are some random number 1-5");
        System.out.print(1 + rand.nextInt(5) + " ");
        System.out.print(1+rand.nextInt(5)+ " ");
        System.out.print(1+rand.nextInt(5));
        System.out.println( );
        System.out.println("Here are a random number 1-100");
        System.out.print(x);

    }
}
