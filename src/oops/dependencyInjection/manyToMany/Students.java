package oops.dependencyInjection.manyToMany;

public class Students {

    private int stuId;
    private String stuName;

    private Courses[] courses;

    // Constructor
    public Students(int stuId, String stuName, Courses[] courses) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.courses = courses;
    }

    public void getData()
    {
        System.out.println("Student Details : ----------" );
        System.out.println("Student id  : "+ stuId);
        System.out.println("Student name : "+ stuName);

        System.out.println("Course details :----------");

        for(Courses cData : courses)
        {
            System.out.println("Course Id : "+ cData.cId);
            System.out.println("Course Name: "+ cData.cName);
        }
    }
}
