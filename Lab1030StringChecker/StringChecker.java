
/**
 * StringCheck Lab 1030
 *
 * @author (Roxy "the Rock" Reid)
 * @version (1030)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class StringChecker
{
    private String keyWord = "";
    private ArrayList<String> words = new ArrayList<String>();
    
    public StringChecker(){
         //  get user input
         getUserInput();
    }
    
    public void getUserInput(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter Key Word");
        keyWord = kb.nextLine();
        String inputStr = "";
        while(!inputStr.equals("quit")){
                inputStr = kb.nextLine();
                if(!inputStr.equals("quit")){
                    words.add(inputStr);
                }
            }
                
    }
   
    public String[] extendArray(String[] p, int x){
        String [] newArray = new String[p.length+x];
        for(int i = 0; i < p.length; i++){
           newArray[i] = p[i];
        }
        return newArray;
    }
   
    
    public static void main(){
     StringChecker sc = new StringChecker();   
    }
}
