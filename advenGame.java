/**
 * Created by fattyduck on 3/24/15.
 */
import java.util.Scanner;
public class advenGame {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String upstairs, downstairs, kitchen, bedroom, fridge, input;
        int area=1;
        downstairs="You are in a creepy house!  Would you like to go \"upstairs\" or into the\n" +
                "\"kitchen\"?";
        //area 1
        upstairs="Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                "\"bedroom\". Or, you can go back \"downstairs\". Where would you like to go?";
        //area 2
        kitchen="There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                "there is, as you'd expect, a refrigerator.  You may open the \"refrigerator\".";
        //area 3
        fridge="Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                "Would you like to eat some of the food? (\"yes\" or \"no\")";
        //area 4
        bedroom="In the bed room you see a bed.  It looks pretty nasty.\n" +
                "Would you like to take a nap? (\"yes\" or \"no\")";
        //area 5


        System.out.println("Welcome and hit enter to play");
        input=scan.nextLine();

        while(area!=0){
            if(area==1){
                System.out.println(downstairs);
                input=scan.nextLine();
                if(input.equalsIgnoreCase("kitchen")){
                    area=3;
                }else if (input.equalsIgnoreCase("upstairs")){
                    area=2;
                }else{
                    System.out.println("Don't know what you talking about!");
                    area=1;
                }

            }
            if(area==2){
                System.out.println(upstairs);
                input=scan.nextLine();
                if(input.equalsIgnoreCase("bedroom")){
                    area=5;
                }else if (input.equalsIgnoreCase("downstairs")){
                    area=1;
                }else{
                    System.out.println("Don't know what you talking about!");
                    area=2;
                }

            } if(area==3){
                System.out.println(kitchen);
                input=scan.nextLine();
                if(input.equalsIgnoreCase("refrigerator")){
                    area=4;
                }else if (input.equalsIgnoreCase("back")){
                    area=1;
                }else{
                    System.out.println("Don't know what you talking about!");
                    area = 3;
                }

            } if(area==4){
                System.out.println(fridge);
                input=scan.nextLine();
                if(input.equalsIgnoreCase("yes")){
                    System.out.println("You have died of food poisoning");
                    break;
                }else if (input.equalsIgnoreCase("no")){
                    area=3;
                }else{
                    System.out.println("Don't know what you talking about!");
                    area=4;
                }

            } if(area==5){
                System.out.println(bedroom);
                input=scan.nextLine();
                if(input.equalsIgnoreCase("yes")){
                    System.out.println("You woke up staring the owner and got kicked out of the house");
                    break;
                }else if (input.equalsIgnoreCase("no")){
                    area=2;
                }else{
                    System.out.println("Don't know what you talking about!");
                    area=5;
                }

            }
        }
    }
}
