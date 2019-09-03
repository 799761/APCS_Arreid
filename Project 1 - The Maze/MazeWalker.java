
/**
 * Write a description of class MazeWalker here.
 *
 * @author (rreid)
 * @version (9/3)
 */
public class MazeWalker
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MazeWalker
     */
    public MazeWalker()
    {
        // initialise instance variables
        x = 0;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void walkMaze(Maze maze, MazeBot mazeBot)
    {
        
        // put your code here
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.turnRight();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.turnLeft();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.turnLeft();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward();
        
        mazeBot.turnRight();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.moveForward();
        mazeBot.turnRight();
        mazeBot.moveForward();
        
        mazeBot.moveForward();
        mazeBot.turnLeft();
        mazeBot.moveForward();
        mazeBot.moveForward();
        
       
      
      
      
        
     
    }
}
