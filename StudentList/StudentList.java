import java.util.*;
/**
 * Write a description of class StudentList here.
 *
 * @author (rreid)
 * @version (10/29)
 */

public class StudentList
{
    // instance variables - replace the example below with your own
    ArrayList<String> stuObjects;
    
    /**
     * Constructor for objects of class StudentList
     */
    public StudentList()
    {
        // initialise instance variables
        stuObjects = new ArrayList<>();
        
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
        String fName="";
        String mName="";
        String lName="";
        Student newStudent = new Student();
        if (comma > 0) {          // Last, First ... and maybe Middle
            lName = fullName.substring(0,comma-1);
            String remainder = fullName.substring(comma+1);
            int space = remainder.indexOf(' ');
            if (space > 0) {        // must be a Middle name too
                fName = remainder.substring(0,space-1);
                mName = remainder.substring(space+1);
            } else {
                fName = remainder;
            }
        } else {                    // First [maybe Middle] Last
            int space = fullName.indexOf(' ');
            if (space > 0) {        // must be a Middle name too
                fName = fullName.substring(0,space-1);
                String remainder = fullName.substring(space+1);
                space = remainder.indexOf(' ');
                if (space > 0) {        // must be a Middle name too
                    mName = remainder.substring(0,space-1);
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
         * clears the screen and then prints a student student with the input student number to the screen.
         * If the Student does not exist, print message to the console: "Student does not exist."
         */
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

    public static void main (String args[])
    {
        // put your code here
    }
}
