package quacktest;

/**
 * Created by fattyduck on 3/6/15.
 */

import java.util.Scanner;

public class testlog {
    public static void main(String[] args){
        Scanner cow= new Scanner(System.in);
        System.out.println("Are you a male or female?");
        String sex, pass;

        sex=cow.next();
        if(sex.equals("male")){ //use variable.equals for strings and other non numbers otherwise it will most likely be false 
            System.out.println("Please enter your age");
        }else{
            System.out.println("Please visit our sister site for Females");
        }

        int age = cow.nextInt();

        if(age>=18){
            System.out.println("Please present password to enter");
        }else{
            age-=18; //shortcut for age = age -18;
            System.out.println("You are too young please come back in " + Math.abs(age) + " years"); //used math.abs() to make sure positive number 
        }

        pass=cow.next();
        if(pass.equals ("cowb91")){
            System.out.println("You have logged in");
        }else{
            System.out.println("Password is not correct, please re-enter");
        }




    }
}
