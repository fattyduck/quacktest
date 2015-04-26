/**
 * Created by fattyduck on 4/12/15.
 */
import java.awt.*;
import javax.swing.JFrame;

public class Graphics1 extends Canvas {
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.drawRect(50,20,100,200);
        g.fillOval(160,20,100,200);
        g.setColor(Color.blue);
        g.fillRect(200,400,200,20);
        g.drawOval(200, 430, 200, 100);

        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat. ", 500,100);
        int x= getWidth()/2;
        int y=getHeight()/2;
        g.drawString("The first letter of this String is at ("+x+","+y+")",x,y);
    }
    public static void main(String[] args){
        JFrame win= new JFrame("Graphics1");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Graphics1 canvas = new Graphics1();
        win.add(canvas);
        win.setVisible(true);
    }
}
