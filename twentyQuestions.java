/**
 * Created by fattyduck on 3/9/15.
 */
import java.util.Scanner;
public class twentyQuestions {
   //misleading title =P
        public static void main(String[] args){
            System.out.println("Think of an object and I will try to guess it");
            String aniOne, aniTwo, vegeOne, vegeTwo, minOne, minTwo, inputOne, inputTwo;
            Scanner bob= new Scanner(System.in);
            aniOne="duck";
            aniTwo="cow";
            vegeOne="celery";
            vegeTwo="Pumpkin";
            minOne="diamond";
            minTwo="granite";

            System.out.println("\nQuestion 1) Is it a animal, vegetable, or mineral?");
            inputOne=bob.nextLine();
            System.out.println("\nQuestion 2) Is it bigger than a bread box");
            inputTwo=bob.nextLine();

          if (inputOne.equalsIgnoreCase("vegetable")){
              if (inputTwo.equalsIgnoreCase("yes")){
                  System.out.println("\nI guess that you are thinking about "+vegeTwo);
              }else{
                  System.out.println("\nI guess that you are thinking about celery "+vegeOne);
              }
          }
            if (inputOne.equalsIgnoreCase("animal")){
                if (inputTwo.equalsIgnoreCase("yes")){
                    System.out.println("\nI guess that you are thinking about "+aniTwo);
                }else{
                    System.out.println("\nI guess that you are thinking about "+aniOne);
                }
            }

            if (inputOne.equalsIgnoreCase("Mineral")){
                if (inputTwo.equalsIgnoreCase("yes")){
                    System.out.println("\nI guess that you are thinking about "+minTwo);
                }else{
                    System.out.println("\nI guess that you are thinking about "+minOne);
                }
            }




        }
}
