import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by fattyduck on 4/20/15.
 */
public class rockPaperSissor {
    public static ArrayList playersHand(String input){
        ArrayList<String> hand= new ArrayList<String>();
        if (input.equalsIgnoreCase("rock")){
            hand.add("  _______ ");
            hand.add(" (____   '——-");
            hand.add("(_____)");
            hand.add("(_____)");
            hand.add("(____)");
            hand.add(" (____)__.——-");
            hand.add("");
        }else if(input.equalsIgnoreCase("paper")){
            hand.add("       _______");
            hand.add("  ____(____   '---");
            hand.add(" (______");
            hand.add("(_______");
            hand.add(" (_______");
            hand.add("   (__________.---");
            hand.add("");

        }else if (input.equalsIgnoreCase("scissors")){
            hand.add("       _______");
            hand.add("  ____(____   '---");
            hand.add(" (______");
            hand.add("(__________");
            hand.add("      (____)");
            hand.add("       (___)__.---");
            hand.add("");

        }
    return hand;
    }
    public static ArrayList computersHand(int number){
        ArrayList<String> hand = new ArrayList<String>();
        if (number == 0){
            hand.add("    _______");
            hand.add("---'   ____)");
            hand.add("      (_____)");
            hand.add("      (_____)");
            hand.add("      (____) ");
            hand.add("---.__(___)");
            hand.add("");

        }else if (number == 1){
            hand.add("    _______");
            hand.add("---'   ____)____");
            hand.add("          ______)");
            hand.add("          _______)");
            hand.add("         _______)");
            hand.add("---.__________)");
            hand.add("");


        }else if (number == 2){
            hand.add("    _______");
            hand.add("---'   ____)____");
            hand.add("          ______)");
            hand.add("       __________)");
            hand.add("      (____)");
            hand.add("---.__(___)");
            hand.add("");
        }
        return hand;
    }
    public static void main(String[] args){
        int player=0;
        int computer=0;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("What is your name?");
        String userName = input.nextLine();
        System.out.println("Hello, "+userName+",  let's play Rock Paper Scissors!");
        System.out.println("Whoever wins 2 out of 3 times first will win the game.\nPlease type your choice!");
        while(true){
            int move = rand.nextInt(3);
            System.out.println("Make your move");
            String user = input.nextLine();
            for(int i=0;i<7;i++){
                System.out.printf("%-20s",computersHand(move).get(i));
                System.out.printf("%-30s",playersHand(user).get(i));
                System.out.println();
            }
            if((user.equalsIgnoreCase("rock")&&move==0)||(user.equalsIgnoreCase("paper")&&move==1)||(user.equalsIgnoreCase("scissors")&&move==2)){
                System.out.println("***We are even!***");
            }
            else if((user.equalsIgnoreCase("paper")&&move==0)||(user.equalsIgnoreCase("scissors")&&move==1)||(user.equalsIgnoreCase("rock")&&move==2)){
                System.out.println("***You win!***");
                player+=1;
            }
            else if((user.equalsIgnoreCase("scissors")&&move==0)||(user.equalsIgnoreCase("rock")&&move==1)||(user.equalsIgnoreCase("paper")&&move==2)){
                System.out.println("***You lose!***");
                computer+=1;
            }
            if(player==2){
                System.out.println("You are the grand winner");
                break;
            }
            if(computer==2){
                System.out.println("You are the grand loser");
                break;
            }
        }
    }
}
