/**
 * Created by fattyduck on 4/1/15.
 */
public class oneCharAtATime {
    public static void main(String[] args){
        String message = "A man, a plan, a canal: panama!";
        for(int i=0; i<31; i++){
            System.out.println(i + " - " + message.charAt(i));
        }
    }
}
