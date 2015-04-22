/**
 * Created by fattyduck on 4/22/15.
 */
public class hf2 {
    public static void main(String[] args){
        Drumkit d = new Drumkit();
        if(d.snare==true){
            d.playSnare();
        }
        d.playTopHat();

    }
}
class Drumkit{
        boolean topHat = true;
        boolean snare = true;

    public void playSnare(){
        System.out.println("bang bang ba-bang");
    }
    public void playTopHat(){
        System.out.println("ding ding da-ding");
    }


}
