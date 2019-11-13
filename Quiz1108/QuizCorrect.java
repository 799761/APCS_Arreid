import java.util.*;
/**
 * Write a description of class QuizCorrect here.
 *
 * @author (rreid)
 * @version (11/13)
 */
public class QuizCorrect
{
    public QuizCorrect()
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int[] number = {1 , 2 , 3 , 4 , 5};
        makeList(number);
        reverseList(array);
    }

    public ArrayList<Integer> makeList(int[] nums){
        ArrayList<Integer> newList = new ArrayList<Integer>();
            for(int i = 0; i < nums.length; i ++){
                newList.add(nums[i]);
            }
        return newList;
    }

    public int[] reverseList(ArrayList<Integer> nums){
        int [] arr = new int[nums.size()];
        for(int i = 0; i < arr.length ; i++){
            arr[i] = nums.get(nums.size() - 1 - i);
        }
        return arr;
    }
    
    public static void main(){
        QuizCorrect quiz = new QuizCorrect();
        
    }
}
