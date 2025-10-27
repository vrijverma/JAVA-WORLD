package oops.interfacec;

// Can abstract class contains constructor ? Ans :  yes
abstract class Person
{
    Integer age;
    String name;

    Person(Integer age, String name)
    {
        this.age = age;
        this.name = name;
    }
}
class Student1 extends Person {
    Integer sId;
    String sName;

    public Student1(Integer sId, String sName, Integer age, String name) {
        super(age, name);
        this.sId = sId;
        this.sName = sName;
    }
}

public class DemoAbs {
    public static void main(String[] args) {

        Person std = new Student1(1,"Vrij",21,"Kumar");

    }
}
