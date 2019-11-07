
/**
 * Write a description of class Student here.
 *
 * @author (rreid)
 * @version (10/29)
 */
public class Student
{
   // instance variables - replace the example below with your own
    String fName;
    String mName;
    String lName;
    int stuNumber;
    double gpa;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
    }

    public String fullName()
    {
        String full = lName;
        full += ", " + fName + " " + mName;
        return full;
    }
    public double gpa()
    {
        return gpa;
    }
    public int stuNumber ()
    {
        return stuNumber;
    }
    
    void setFirstName ( String firstName )
    {
        fName = firstName;
    }
    void setMiddleName ( String middleName )
    {
        mName = middleName;
    }
    
    void setLastName ( String lastName )
    {
        lName = lastName;
    }
    
    void setStudentInfo ( int newStuNumber, double newGpa )
    {
         stuNumber = newStuNumber;
         gpa = newGpa;
    }
}
