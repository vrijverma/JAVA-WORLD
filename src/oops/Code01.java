package oops;

// blueprint of the class called Student

class Student
{

    // HAS - part (variables)
    int age;
    String name;


    // Does - part (methods)
    public  void study()
    {
        System.out.println("Studying..");
    }
    public void run()
    {
        System.out.println("Running...");
    }

}
public class Code01 {
    // Automatically called by JVM
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Vrij";
        s1.age = 21;
        s1.run();
    }
}
/*

    // Instance Variable : if declare the variable Inside the class outside the methods.
                                            or
                           IF the value of the variable changes from object to object call instance variable
    Q1: When will the memory for instance variables?
        once object is created, also by default JVM assign default value

                like : for int 0, for String null

* */
