/**
 * Created by fattyduck on 3/24/15.
 */
import java.util.Scanner;

public class babyNim {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String input;
        String many="How many do you want to remove?";
        int a=3;
        int b=3;
        int c=3;
        int take;
        int total=a+b+c;
        while(total>0){
            System.out.println("A: "+a+" B: "+b+" C: "+c);
            System.out.println("Choose a pile");
            input=scan.nextLine();
            if (input.equalsIgnoreCase("a")){
                System.out.println(many);
                take=scan.nextInt();
                a-=take;
                scan.nextLine();
                if(a<0){
                    System.out.println("You are drunk my friend");
                    break;
                }
            }else if(input.equalsIgnoreCase("b")){
                System.out.println(many);
                take=scan.nextInt();
                b-=take;
                scan.nextLine();
                if(b<0){
                    System.out.println("You are drunk my friend");
                    break;
                }
            }else if(input.equalsIgnoreCase("c")){
                System.out.println(many);
                take=scan.nextInt();
                c-=take;
                scan.nextLine();
                if(c<0){
                    System.out.println("You are drunk my friend");
                    break;
                }
            }else{
                System.out.println("You are drunk my friend");
                break;
            }

            total=a+b+c;
        }
        if(total==0){
            System.out.println("Congratz you did it!");
        }
    }
}
