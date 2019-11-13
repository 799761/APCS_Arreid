/**
 * Write a description of class StudentList here.
 *
 * @author (rreid)
 * @version (10/29)
 */
import java.util.*;
public class StudentList
{
    // instance variables - replace the example below with your own
    ArrayList<Student> stuObjects;
    
    /**
     * Constructor for objects of class StudentList
     */
    public StudentList()
    {
        // initialise instance variables
        stuObjects = new ArrayList<Student>();
        
        //names.add("new student record");
        //names.delete("delete student record");
        //names.print(System.out.println(record));
        
    }

    /**
     * addStudent
     * Allows the user to add a student to the end of the List.
     * For each student, the user can imput a student number, a GPA, and a student name.
     * Names may be entered in one of four formats::
     * 1. Last, First   
     * 2. Last, First Middle   
     * 3. First Last   
     * 4. First Middle Last
     */
    public void addStudent(String fullName)
    {
        int comma = fullName.indexOf(',');
        Scanner in = new Scanner(System.in);
        String fName="";
        String mName="";
        String lName="";
        Student newStudent = new Student();
        if (comma > 0) {          // Last, First ... and maybe Middle
            lName = fullName.substring(0,comma);
            String remainder = fullName.substring(comma+1);
            int space = remainder.indexOf(' ');
            while(space==0) {   // get rid of extra spaces after comma before fName
                remainder = remainder.substring(1);
                space = remainder.indexOf(' ');
            }
            if (space > 0) {        // must be a Middle name too
                fName = remainder.substring(0,space-1);
                mName = remainder.substring(space+1);
            } else {
                fName = remainder;
            }
        } else {                    // First [maybe Middle] Last
            int space = fullName.indexOf(' ');
            if (space > 0) {        // must be a Middle name too
                fName = fullName.substring(0,space);
                String remainder = fullName.substring(space+1);
                space = remainder.indexOf(' ');
                if (space > 0) {        // must be a Middle name too
                    mName = remainder.substring(0,space);
                    lName = remainder.substring(space+1);
                } else {
                    lName = remainder;
                }
              } else {
            }
        }
        newStudent.setFirstName(fName);
        newStudent.setMiddleName(mName);
        newStudent.setLastName(lName);
        System.out.println("  Student Number: ");
        int num = in.nextInt();
        System.out.println("  Student GPA: ");
        double gpa = in.nextDouble();
        newStudent.setStudentInfo(num, gpa);
        
        stuObjects.add(newStudent);
    }
    
    public void deleteStudent(String lastName)
    {
        /*
         * 
         Allows the user to specify a Student last name deleted from the list.
         */
    }
    public void deleteStudent(int stuNumber)
    {
        /*
         * 
         *  Allows the user to specify a student number and deletes that student from the list. 
         */
    }
    public void editStudentList(String lastName)
    {
        /*
         *  Allows the user to specify a student name and then update or change the Student name and GPA
         */
    }
    public void editStudentList(int stuNumber)
    {
        /*
         *  Allows the user to specify a Student number and then update or change the Student name and GPA
         */
    }
    public void clearList()
    {
        /*
         *  Deletes the entire list (null in each element without a student record).
         */
    }
    public void printList()
    {
        /*
         *  Clears the screen and then prints the list to the screen.  Does not print null records.
         */
        //System.out.print('\u000C');   // clear screen
        System.out.println("----- Student List -----");
        for(int i = 0; i < stuObjects.size(); i++){
            Student stud = stuObjects.get(i);
            if(stud != null) {
                System.out.print("   " + stud.stuNumber() + " ");
                System.out.print(stud.fullName() + " ");
                System.out.print("GPA: " + stud.gpa() + " ");
                System.out.println();
            }
        }
        System.out.println("-----------------------");
    }
    public void printStudent(String lastName)
    {
        /*
         *  Clears  the screen and then prints a student with the input name to the screen.  If the Student does not 
         *  exist, print message to the console: "Student does not exist."
         */
    }
    public void printStudent(int stuNumber)
    {
        /*    
         * clears the screen and then prints a student with the input student number to the screen.
         * If the Student does not exist, print message to the console: "Student does not exist."
         */
        //System.out.print(stud.get(i) + " ");
    }
    public void SortStudents(String lastName)
    {        
        /*
         * Sorts students by student name
         */
    }
    public void SortStudents(int stuNumber)
    {
        /*
         * Sorts students by student number
         */
    }
    public ArrayList<Student> filterSearchStudentList(String key)
    {
        /*
         *  Finds all students matching "key" and creates and returns a list of those students  
         */
        ArrayList<Student> filteredList = new ArrayList();
        
        return filteredList;
    }

    
}
