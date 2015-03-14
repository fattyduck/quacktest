/**
 * Created by fattyduck on 3/13/15.
 */
import java.util.Scanner;
public class DrawRocket {

    public static void drawHead(int size){
        for (int i=0; i<size; i++){
            for(int s=0; s<size-i;s++){
                System.out.print(" ");
            }
            for (int x=0; x<=i; x++){
                System.out.print('/');
            }
            System.out.print("**");
            for (int b=0;b<=i; b++){
                System.out.print('\\');
            }
            System.out.println();
        }
    }

    public static void drawLine(int size){
      String line="+";
      for (int i =0; i<=size; i++){
            line+="--";
       }
       line+="+";
       System.out.println(line);
    }

    public static void drawBody(int size){
        for (int i=0; i<=size; i++){
            String body="|";
            for (int d=0; d<size+1; d++){
                body+="XX";
                }
            body+="|";
            System.out.println(body);
        }
    }
    public static void drawRocket(int size){
        drawHead(size);
        drawLine(size);
        drawBody(size);
        drawLine(size);
        drawBody(size);
        drawLine(size);
        drawHead(size);
    }
    public static void main(String[] args){
        Scanner cow=new Scanner(System.in);
        int allan;
        System.out.println("How big do you want your rocket to be?");
        allan=cow.nextInt();
        drawRocket(allan);
    }
}
