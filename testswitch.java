package quacktest;

/**
 * Created by fattyduck on 3/6/15.
 */

import java.util.Scanner;


public class testswitch {
    public static void main(String[] args){

        Scanner cow = new Scanner(System.in);
        System.out.println("how old are you?");
        int age=cow.nextInt();

        switch (age){
            
  	     /*
	    *Created switch statement to tell children what they need to do. After the age of 5 the instruction is the same
	    */

	    case 1: 
                System.out.println("you need to drink milk");
                break;
 
            case 2:
                System.out.println("you need to start waling");
                break;
            case 3:
                System.out.println("you need to start running");
                break;
            case 4:
                System.out.println("you need to start learning math");
                break;
            default:
                System.out.println("you need to obey your parents and teachers");
                break;
        }



    }
}
