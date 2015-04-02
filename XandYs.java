/**
 * Created by fattyduck on 4/1/15.
 */
public class XandYs {
    public static void main(String[]args){
        double x;
        double y;
        System.out.println("X    Y");
        System.out.println("-----------");
        for(double i=10; i>=-10; i-=.5){
            x=i;
            y=x*x;
            System.out.printf("%-5.0f", x);
            System.out.printf("%-5.0f", y);
            System.out.println();

        }

    }
}
