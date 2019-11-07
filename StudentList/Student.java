
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
        fName = "First";
        lName = "Last";
        stuNumber = 0;
        gpa = 0.0;
    }

    public String fullName()
    {
        String full = lName;
        full += ", " + fName;
        if(mName != null && mName.equals("")) {
            full += " " + mName;
        }
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
    
    public void setFirstName ( String firstName )
    {
        fName = firstName;
    }
    public void setMiddleName ( String middleName )
    {
        mName = middleName;
    }
    
    public void setLastName ( String lastName )
    {
        lName = lastName;
    }
    
    public void setStudentInfo ( int newStuNumber, double newGpa )
    {
         stuNumber = newStuNumber;
         gpa = newGpa;
    }
}
