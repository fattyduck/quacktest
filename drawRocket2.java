import java.util.Scanner;

/**
 * Created by fattyduck on 3/16/15.
 */

public class drawRocket2 {
    public static void drawhead(int size){
        for (int row=0; row<size+size-1; row++){
            for (int space=1; space<size+size-row; space++){
                System.out.print(' ');
            }
            for (int fslash=0 ; fslash<=row; fslash++){
                System.out.print('/');
            }
            System.out.print("**");
            for (int fslash=0 ; fslash<=row; fslash++){
                System.out.print('\\');
            }
           System.out.println();
        }
    }

    public static void drawline(int size){
        System.out.print("+");
        for (int line=0; line<=(size*2-1); line++){
            System.out.print("=*");
        }
        System.out.print("+");
        System.out.println();
    }

    public static void bodyu(int size) {
        for (int row = 1;  row <= size; row++) {
            System.out.print("|");

            for (int dot = 1; dot <= (-1 * row) + size; dot++) {
                System.out.print(".");
            }

            for (int up = 1; up <= row; up++) {
                System.out.print("/\\");
            }
            for (int dot = 1; dot <= 2*((-1 * row) + size); dot++) {
                System.out.print(".");
            }
            for (int up = 1; up <= row; up++) {
                System.out.print("/\\");
            }
            for (int dot = 1; dot <= (-1 * row) + size; dot++) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    public static void bodyd(int size) {
        for (int row = 1;  row <= size; row++) {
            System.out.print("|");

            for (int dot = 1; dot <= -1 + row; dot++) {
                System.out.print(".");
            }

            for (int down = size - row + 1; down >= 1; down--) {
                System.out.print("\\/");
            }

            for (int dot = 1; dot <= 2*(-1 + row); dot++) {
                System.out.print(".");
            }

            for (int down = size - row + 1; down >= 1; down--) {
                System.out.print("\\/");
            }

            for (int dot = 1; dot <= -1 + row; dot++) {
                System.out.print(".");
            }

            System.out.print("|");
            System.out.println();
        }
    }
    public static void drawR(int size){
        drawhead(size);
        drawline(size);
        bodyu(size);
        bodyd(size);
        drawline(size);
        bodyu(size);
        bodyd(size);
        drawline(size);
        drawhead(size);
    }

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the rocket size you desire!");
        int size = input.nextInt();
        drawR(size);
    }
}
