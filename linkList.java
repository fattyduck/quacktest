/**
 * Created by fattyduck on 3/29/15.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class linkList {
    public static void main(String[] args){
        List<Integer> arraylist= new ArrayList<Integer>();
        List<Integer> linkedList=new LinkedList<Integer>();

        doTiming("ArrayList", arraylist);
        doTiming("LinkedList", linkedList);
    }
    private static void doTiming(String type, List<Integer> list){
        for (int i=0; i<1E5;i++){
            list.add(i);
        }
        long start=System.currentTimeMillis();
        for (int i=0; i<1E5;i++){
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println((end-start)+" for "+type);
    }
}
