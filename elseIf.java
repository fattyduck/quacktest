/**
 * Created by fattyduck on 3/8/15.
 */

import java.util.Scanner;
public class elseIf {
    public static void main(String[] args){
        Scanner cow=new Scanner(System.in);
        int people, trains, cars, total;
        System.out.println("Let me know how many people, buses, and cars are in the city and I will let you know the fast way to enter city");
        System.out.println("How many people are there");
        people=cow.nextInt();
        System.out.println("How many trains are there?");
        trains=cow.nextInt();
        System.out.println("How many cars are there?");
        cars=cow.nextInt();
        total=cars+people;

        if(total<=20){
            System.out.println("Traveling in a car is your fastest option!");
        }else if(total>=50){
            System.out.println("Traveling in a train is your fastest option!");
        }else{
            System.out.println("Traveling on feet is your fastest option!");
        }

    }
}
