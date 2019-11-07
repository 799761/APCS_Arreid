
/**
 * Write a description of class StudListRunner here.
 *
 * @author (rreid)
 * @version (10/29)
 */
import java.util.*;

public class StudListRunner
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class StudListRunner
     */
    public static void StudListRunner()
    {
        StudentList studList = new StudentList();
        int menuChoice = -1;
        
      /*
       * 
       studList.addStudent("Roxanne Reyes Reid");
        studList.addStudent("Mary Reid");
        studList.addStudent("Reid, Georgia");
        studList.addStudent("Reid, Roxy");
        studList.printList();
        */
        while (menuChoice!=0)
        {
           Scanner in = new Scanner(System.in);
           menuChoice = menuNumber();
            if(menuChoice==1) { // 1. Add New Student
               System.out.println("Enter Student Name: ");
               String name = in.nextLine();
               studList.addStudent(name);
            }
            if(menuChoice==2) { // 2. Delete Student
            }
            if(menuChoice==3) { // 3. Print Student Info
            }
            if(menuChoice==4) { // 4. Search for Student
            }
            if(menuChoice==5) { // 5. Clear Student List
            }
            if(menuChoice==6) { // 6. Sort by Student Number
            }
            if(menuChoice==7) { // 7. Sort by Last Name
            }
            
            studList.printList();
        }
        System.out.println("Exiting");
    }
    public static int menuNumber()
    {
        Scanner in = new Scanner(System.in);
        Boolean validInput = false;
        int result = 0;
        // display menu:
        while(!validInput) {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("-----------------------------");
            System.out.println("1. Add New Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Print Student Info");
            System.out.println("4. Search for Student");
            System.out.println("5. Clear Student List");
            System.out.println("6. Sort by Student Number");
            System.out.println("7. Sort by Last Name");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            // get input:
            result = in.nextInt();
            if(result>=0 && result<8) {
                validInput = true;
            } else {
                System.out.println("INVALID Input. Must be a number between 0 and 7");
                //System.out.print("\033[H\033[2J");   // clear screen
           }
        }
        return result;
    }
    
    public static void main (String args[])
    {
        // put your code here
        System.out.println("Running StudentList...");
        StudListRunner();
    }
}
