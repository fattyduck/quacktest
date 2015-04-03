/**
 * Created by fattyduck on 4/3/15.
 */
import java.util.Scanner;
public class Nim {

   public static void main(String[] args){
       String player1, player2, answer;
       Scanner scan=new Scanner(System.in);
       int a=3;
       int b=4;
       int c=5;
       int taken;
       int player=1;
       String take="How many do you want to remove from Pile ";
       System.out.print("Player 1, enter your name:");
       player1=scan.nextLine();
       System.out.print("Player 2, enter your name:");
       player2=scan.nextLine();
       while(true){
           if((a+b+c)<=0&&player==1){
               System.out.println(player1 + " is the winner");
               break;
           }else if((a+b+c)<=0&&player==2){
               System.out.println(player2 + " is the winner");
               break;
           }


           if(player==1){
               System.out.println("A: "+a+" B: "+b+" C: "+c);
               System.out.println(player1 + " choose a pile");
               answer=scan.nextLine();
               if(answer.equalsIgnoreCase("a")){
                   System.out.print(take+" A:");
                   taken=scan.nextInt();
                   if(taken<=a){
                   a-=taken;
                   }else{
                       System.out.println("You can't take more than there is, pick again");
                       taken=scan.nextInt();
                       if(taken<=a){
                           a-=taken;
                       }else{
                           System.out.println("Clearly you can't read directions");
                           a=0;
                           b=0;
                           c=0;
                           player=2;
                       }
                   }
                   player=2;
               }else if(answer.equalsIgnoreCase("b")){
                   System.out.print(take+" B:");
                   taken=scan.nextInt();
                   if(taken<=b){
                       b-=taken;
                   }else{
                       System.out.println("You can't take more than there is, pick again");
                       taken=scan.nextInt();
                       if(taken<=b){
                           b-=taken;
                       }else{
                           System.out.println("Clearly you can't read directions");
                           a=0;
                           b=0;
                           c=0;
                           player=2;
                       }
                   }
                   player=2;
               }else if(answer.equalsIgnoreCase("c")){
                   System.out.print(take+" C:");
                   taken=scan.nextInt();
                   if(taken<=c){
                       c-=taken;
                   }else{
                       System.out.println("You can't take more than there is, pick again");
                       taken=scan.nextInt();
                       if(taken<=c){
                           c-=taken;
                       }else{
                           System.out.println("Clearly you can't read directions");
                           a=0;
                           b=0;
                           c=0;
                           player=2;
                       }
                   }
                   player=2;
               }
           }
               if(player==2){
                   System.out.println("A: "+a+" B: "+b+" C: "+c);
                   System.out.println(player2 + " choose a pile");
                   answer=scan.nextLine();
                   if(answer.equalsIgnoreCase("a")){
                       System.out.print(take+" A:");
                       taken=scan.nextInt();
                       if(taken<=a){
                           a-=taken;
                       }else{
                           System.out.println("You can't take more than there is, pick again");
                           taken=scan.nextInt();
                           if(taken<=a){
                               a-=taken;
                           }else{
                               System.out.println("Clearly you can't read directions");
                               a=0;
                               b=0;
                               c=0;
                               player=1;
                           }
                       }
                       player=1;
                   }else if(answer.equalsIgnoreCase("b")){
                       System.out.print(take+" B:");
                       taken=scan.nextInt();
                       if(taken<=b){
                           b-=taken;
                       }else{
                           System.out.println("You can't take more than there is, pick again");
                           taken=scan.nextInt();
                           if(taken<=b){
                               b-=taken;
                           }else{
                               System.out.println("Clearly you can't read directions");
                               a=0;
                               b=0;
                               c=0;
                               player=1;
                           }
                       }
                       player=1;
                   }else if(answer.equalsIgnoreCase("c")){
                       System.out.print(take+" C:");
                       taken=scan.nextInt();
                       if(taken<=c){
                           c-=taken;
                       }else{
                           System.out.println("You can't take more than there is, pick again");
                           taken=scan.nextInt();
                           if(taken<=c){
                               c-=taken;
                           }else{
                               System.out.println("Clearly you can't read directions");
                               a=0;
                               b=0;
                               c=0;
                               player=1;
                           }
                       }
                       player=1;
                   }
               }

       }
   }
}
