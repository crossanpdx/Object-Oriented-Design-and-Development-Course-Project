// Super Class
package studentRecords;

/**
 * Create a Student inheritance hierarchy. This should include the following 
 * requirements:
    * Create the Student class. Student will be the super class and an abstract 
 * class. At least one method on Student will be abstract.
    * Student class holds the attributes first name, last name, student ID, GPA, 
 * status (resident or nonresident), and mentor. All attributes will be 
 * inherited by the subclasses.
    * Create appropriate overloaded constructors for the super class, Student.
    * Student has an abstract method, calculateTuition(), which will be 
 * implemented in the subclasses Undergraduate, Graduate, and Part-time, making 
 * use of the polymorphism principle.
 */


/**
 *
 * @author Ryan Crossan
 */    
public abstract class Student {
    private String firstName;
    private String lastName;
    private int studentID;
    private double GPA;
    private String status;
    private String mentor;
    /**
     * @param args the command line arguments
     */
    public Student() {
  
    }
    
    public Student(String first, String last, int id, double gpa,
            String status1, String mentor1)
        {
        firstName = first;
        lastName = last;
        studentID = id;
        GPA = gpa;
        status = status1;
        mentor = mentor1;
    }
    
    public Student(String first, String last, int id, double gpa,
            String status1, String mentor1, String thesisTit, String ThesisAdv)
        {
        firstName = first;
        lastName = last;
        studentID = id;
        GPA = gpa;
        status = status1;
        mentor = mentor1;
    }
    
    //getters and setters
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setFirstName(String first)
    {
 
        firstName = first;
 
    }
    public void setLastName(String last)
    {
        lastName = last;
    }
    public int getStudentID()
    {
        return studentID;
    }
    public void setStudentID(int id)
    {
        studentID = id;
    }
    public String getStatus()
    {
        return status;
    }
    public void setStatus(String s)
    {
        status = s;
    }
    public double getGPA()
    {
        return GPA;
    }
    public void setGPA(double gpa)
    {
        GPA = gpa;
    }
    public String getMentor()
    {
        return mentor;
    }
    public void setMentor(String mentor1)
    {
        mentor = mentor1;
    }
    
    public abstract double calculateTuition(int hour, int status);
    
    public abstract String add();
 
    public abstract boolean update();
 
    public abstract boolean delete();
 
    public abstract boolean query();
    
}

