
/**
 * Write a description of class SortTester here.
 *
 * @author (rreid)
 * @version (1024)
 */
import java.util.*;
import java.util.Random;
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
        loadNumbers(30);
        printList("random");
        bubbleSort();
        printList("bubbleSort");
        insertSort();
        printList("insertSort");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void loadNumbers(int n)
    {
        // load array with random numbers 1-100 inclusive
        Random rand = new Random();
        for(int i = 0; i < n ; i++){
            int rand_int = rand.nextInt(100)+ 1;
            // numList.set(i, rand_int);
            numList.add(rand_int);
        }
    }
    
    public void bubbleSort(){
        for(int i = numList.size() - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(numList.get(j) > numList.get(j + 1)){
                    Collections.swap(numList, j, j+1);
                }
            }
        }
    }
    
    public void insertSort(){
        for(int i = 1; i < numList.size(); i++){
            if(numList.get(i) < numList.get(i-1)){
                int temp = numList.get(i);
                for(int j = i; j > 0; j--){
                    int num = numList.get(j);
                    if( j == 0 ){
                        numList.set(j, temp);
                    } else {
                        numList.set(j, num);
                    }
                }
            }   
        }
    }

   
   public void printList(String title){
       System.out.print(title + ": ");
       for(int i = 0; i < numList.size(); i++){
           System.out.print(numList.get(i) + " ");
        }
        System.out.println();
    }
}

