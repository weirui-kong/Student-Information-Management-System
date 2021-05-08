import java.util.ArrayList;


//interface MA_Interface
//{
//    String tutor = null;
//}
//
//interface DO_Interface extends MA_Interface
//{
//    String lab = null;
//}
class Grade
{
    String stuID;
    String courseName;
    String courseID;
    String credit;
    int reg;
    int mid;
    int fin;

    public Grade(String stuID, String courseName, String courseID, String credit, int reg, int mid, int fin)
    {
        this.stuID = stuID;
        this.courseName = courseName;
        this.courseID = courseID;
        this.credit = credit;
        this.reg = reg;
        this.mid = mid;
        this.fin = fin;
    }

    public String getStuID()
    {
        return stuID;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public String getCourseID()
    {
        return courseID;
    }

    public String getCredit()
    {
        return credit;
    }

    public int getReg()
    {
        return reg;
    }

    public int getMid()
    {
        return mid;
    }

    public int getFin()
    {
        return fin;
    }
}

public class Student
{
    //enum Degree {Bachelor, Master, Doctor};
    private String name;
    private String ID;
    private String gender;
    private String major;
    private String dorm;
    ArrayList<Grade> gradeArrayList = new ArrayList<Grade>();

    public Student(String name, String ID, String gender,String major, String dorm)
    {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.major = major;
        this.dorm = dorm;
        initializeGrade();
    }

    void initializeGrade()
    {

    }

    String getTag()
    {
        return "";
    }

    public String getName()
    {
        return name;
    }

    public String getID()
    {
        return ID;
    }

    public String getGender()
    {
        return gender;
    }

    public String getMajor()
    {
        return major;
    }

    public String getDorm()
    {
        return dorm;
    }

    String getTutor(){return null;}
    String getLab(){return null;}
}

class Bachelor extends Student
{
    public Bachelor(String name, String ID, String gender,String major, String dorm)
    {
        super(name, ID, gender, major, dorm);
    }

    @Override
    String getTag()
    {
        return "BA";
    }
}

class Master extends Bachelor
{
    String tutor;

    public Master(String name, String ID, String gender, String major, String dorm, String tutor)
    {
        super(name, ID, gender,major, dorm);
        this.tutor = tutor;
    }
    @Override
    String getTag()
    {
        return "MA";
    }

    public String getTutor()
    {
        return tutor;
    }
}

class Doctor extends Master
{
     String lab;

    public Doctor(String name, String ID,  String gender,String major, String dorm, String tutor, String lab)
    {
        super(name, ID, gender, major, dorm,tutor);
        this.lab = lab;
    }
    @Override
    String getTag()
    {
        return "DO";
    }

    public String getTutor()
    {
        return tutor;
    }

    public String getLab()
    {
        return lab;
    }
}


