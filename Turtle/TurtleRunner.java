
/**
 * Write a description of class TurtleRunner here.
 *
 * @author (RReid)
 * @version (829)
 */
import java.awt.*;
public class TurtleRunner
{
    public static void main(){

        Turtle   t;

        TurtleDrawingWindow win = new TurtleDrawingWindow();

        int      size, turn;

        t = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        
            t.jumpTo(0, 0);
        win.add(t);
        win.setVisible(true);
        t.penSize(3);
        size     = 345;    //logical units
        turn     = 245;    //in degree
        t.penColor(Color.pink);
        for(int i = 0; i < 100; i++){
            t.move( size ); 
            t.turn( turn );
            String n = ""+i;
            //t.print(n);
        }
        t.jumpTo(50, 45);
        t.heading(0);
        size     = 210;
        t.penColor(Color.green);
        t.penSize(3);
        for(int i = 0; i < 120; i++){
            t.move( size ); 
            t.turn( turn );
            String n = ""+i;
            //t.print(n);
        }
        t.penSize(1);
        t.jumpTo(75, 75);
        t.heading(0);
        size     = 100;
        t.penColor(Color.green);
        for(int i = 0; i < 120; i++){
            t.move( size ); 
            t.turn( turn );
            String n = ""+i;
            //t.print(n);
        }

        
        
        t.hide();

    }
}
