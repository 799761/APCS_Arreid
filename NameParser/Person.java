
/**
 * Write a description of class Person here.
 *
 * @author (rreid)
 * @version (924/926)
 */
public class Person
{
    // instance variables - replace the example below with your own
    String fName;
    String mName;
    String lName;

    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
       fName = parser.next();
            mName = parser.next();
            if (parser.hasNext()){
                lName = parser.next();
            } else {
                lName = mName;
                mName = " ";
    }

   
}


}


