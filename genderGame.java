import java.util.Scanner;

public class genderGame {
    public static void main(String[] args){
        String gender, fname, lname;
        int age;
        Scanner cow=new Scanner(System.in);
        System.out.println("What is your gender (M or F): ");
        gender=cow.nextLine();

        if(gender.equalsIgnoreCase("f")){
            System.out.println("First name:");
            fname=cow.nextLine();
            System.out.println("Last name");
            lname=cow.nextLine();
            System.out.println("age");
            age=cow.nextInt();
            cow.nextLine();
            System.out.println("are you married?");
            String mstatus=cow.nextLine();
            if(mstatus.equalsIgnoreCase("yes")){
                System.out.println("Then I shall call you Mrs. "+lname);
            }else{
                if(age>=18){
                    System.out.println("Then I shall call you Ms. "+lname);
                }else{
                    System.out.println("Then I shall call you "+fname);
                }

            }

        }else if(gender.equalsIgnoreCase("m")){
            System.out.println("First name:");
            fname=cow.nextLine();
            System.out.println("Last name");
            lname=cow.nextLine();
            System.out.println("age");
            age=cow.nextInt();
            if(age>=18){
                System.out.println("Then I shall call you Ms. "+lname);
            }else{
                System.out.println("Then I shall call you "+fname);
            }

        }
    }
}