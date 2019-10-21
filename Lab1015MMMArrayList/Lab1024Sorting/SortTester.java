
/**
 * Write a description of class SortTester here.
 *
 * @author (rreid)
 * @version (1024)
 */
import java.util.*;
public class SortTester
{
    // instance variables - replace the example below with your own
    ArrayList<Integer> numList = new ArrayList<Integer>();
    

    /**
     * Constructor for objects of class SortTester
     */
    public SortTester()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void loadNumbers(int n)
    {
        // put your code here
    }
    
    public void bubbleSort(){
        for(int i = nums.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(nums[j] > nums[j+1]){
                    swap (nums, j, j+1);
                }
            }
        }
    }
    
    public void insertSort(){
        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j > 0; j--){
                if(numList.get(j) > numList.get(j-1)){
                int temp = numList.get(j);
                numList.set(j, j-1);
                numList.set(j-1, temp);
            }
        }
    }
    }
}

