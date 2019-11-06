import java.util.*;
/**
 * StringCheck Lab 1030
 *
 * @author (Roxy "the Rock" Reid)
 * @version (1030)
 */

public class StringChecker
{
    private String keyWord = "cat";
    private ArrayList<String> wordList = new ArrayList<String>();
    private String[] wordArray = { "cat" , "catcher" , "Catchup"};
    
    
    public StringChecker(){
         // loadWords();
         // getKey();
    }
    
    public ArrayList<String> wordChecker(String[] str, String key){
        ArrayList<String> tempList = new ArrayList<String>();
        for(int i = 0; i < str.length; i++){
            if(str[i] != null){
                if(str[i].indexOf(key) != -1){
                    tempList.add(str[i]);
                }
            }
        }
        return tempList;
    }
    
    public void getUserInput(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter Key Word");
        keyWord = kb.nextLine();
        String inputStr = "";
        while(!inputStr.equals("quit")){
                inputStr = kb.nextLine();
                if(!inputStr.equals("quit")){
                    wordList.add(inputStr);
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
     ArrayList<String> strings = sc.wordChecker(sc.wordArray, sc.keyWord);
    }
}
