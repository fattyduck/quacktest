/**
 * Created by fattyduck on 4/22/15.
 */
public class hf3 {
    public static void main(String[] args){
        Echo el = new Echo();
        //Write here
        Echo e2 = new Echo();
        int x = 0;
        while (x<4){
            el.hello();
            //write here
            el.count =el.count+1;
            if(x>0){
                e2.count = e2.count+1;
            }
            if(x>1){
                e2.count=e2.count+el.count;
            }
            x=x+1;
        }
        System.out.println(e2.count);

    }
}
class Echo{
    int count = 0;
    void hello(){
        System.out.println("Helloooo...");
    }
}
