
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
    public void walkMaze(Maze maze, MazeBot mazeBot){
    // loops
    while(mazeBot.didReachGoal() == false){
            while(mazeBot.canMoveForward())
                mazeBot.moveForward();
        }
    // if it can't go forward it'll check where it can go
        if(mazeBot.canMoveForward() == false){
           mazeBot.turnRight();
        if(mazeBot.canMoveForward()){      
            mazeBot.moveForward();
        }
        else{
             mazeBot.turnLeft();
             mazeBot.turnLeft();
            }
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
        if (mazeBot.didReachGoal()){
            mazeBot.signalSuccess();
        }
        else {
             mazeBot.signalError();
        }
    }
}  
}     