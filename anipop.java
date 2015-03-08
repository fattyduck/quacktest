package nyc.c4q.disonruan;

/**
 * Created by fattyduck on 3/5/15.
 * This code is just for fun and not going to be further commenting
 */
import java.util.Scanner;

public class anipop {
    public static void main(String[] args){
        Scanner cow = new Scanner(System.in);
        int dog, cat, human;
        System.out.println("How many humans are here?");
        human=cow.nextInt();
        System.out.println("How many dogs are here?");
        dog=cow.nextInt();
        System.out.println("How many cats are here?");
        cat=cow.nextInt();
        System.out.println("I will tell you let me tell you 3 facts about the future");
        if(human<cat){
            System.out.println("We are going to be doomed");
        }else{
            System.out.println("We are going to be saved");
        }

        if(human<dog) {
            System.out.println("This world is going to be covered in drool");
        }else{
            System.out.println("This world is going to be a desert");
        }

        if(dog>cat){
            System.out.println("Cats will be extinct");
        }else{
            System.out.println("There will still be cats");
        }

    }
}
