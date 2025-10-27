package oops.dependencyInjection.manyToMany;

public class Main {
    public static void main(String[] args) {

        Courses c1 = new Courses(101,"JAVA");
        Courses c2 = new Courses(102,"Python");
        Courses c3 = new Courses(103,"Cyber Security");

          Courses[] courses =   new Courses[3];
          courses[0] = c1;
          courses[1] = c2;
          courses[2] = c3;

        Students stu1 = new Students(01,"Vrij Verma",courses);
        Students stu2 = new Students(02,"Alok Kumar",courses);
        Students stu3 = new Students(03,"Aman Kumar",courses);


        stu1.getData();
        stu2.getData();
        stu3.getData();


    }
}
