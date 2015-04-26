/**
 * Created by fattyduck on 3/24/15.
 */
import java.util.Scanner;
public class doWhileSwim {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String swimmer1="cow";
        double minimumTemp=70;
        double currentTemp, savedTemp;
        int swimTime=0;

        System.out.println("What is the current water temperature?");
        currentTemp=scanner.nextDouble();
        savedTemp=currentTemp;

        do{
            swimTime++;
            System.out.println("\t" +swimmer1+" swims for " +swimTime);
            currentTemp-=.5;
            System.out.println("\tThe temperature is now "+currentTemp+ "degrees");
        }while(currentTemp>=minimumTemp);
        System.out.println(swimmer1+ " stopped swimming, total swim time: "+swimTime+" min.");

    }
}
