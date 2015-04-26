import java.util.Random;

public class diceDoubles{
    public static void main(String[] args){
        Random rand=new Random();
        int roll1=rand.nextInt(6);
        int roll2=rand.nextInt(6);
        int total=roll1+roll2;
        System.out.println("Roll#1: "+roll1);
        System.out.println("Roll#2: "+roll2);
        System.out.println("Total: "+total);
        while(roll1!=roll2){
            roll1=rand.nextInt(6);
            roll2=rand.nextInt(6);
            total=roll1+roll2;
            System.out.println("Roll#1: "+roll1);
            System.out.println("Roll#2: "+roll2);
            System.out.println("Total: "+total);
        }

    }
}