
/**
 * Write a description of class MMM here.
 *
 * @author (rrreid)
 * @version (1015)
 */

import java.util.*;
public class MMM
{
    private ArrayList<Integer> nums;
    /**
     * Constructor for objects of class MMM
     */
    public MMM() {
        loadList(100);
        findMean();
        findMedian();
        findMode();
        printList();
        
    }

    public void loadList(int n){
        for(int i = 0; 1 < n; i++){
            int rnd = (int)(Math.random()*100) + 1;
            list.add(rnd);
        }
    }
    public void printList(){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + ", ");
        }
    }
    
    public double findMean(){
        int sm = getSum(list);
        
        return 0;
    }
    
    public Integer getSum(Arraylist<Integer> numList){
        int sum = 0;
        for(int i = 0; i < num.List.size(); i++){
            sum += numList.get(i);
        }
        
        return sum;
    }
    
    public double findMean(){
        double mean;
        
    }
}
        
