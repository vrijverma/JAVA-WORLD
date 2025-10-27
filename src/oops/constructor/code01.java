package oops.constructor;
            /* Constructor*/
//:- it is specialized method whose name of the same that of  class name.
//:- it does not have any explicit return type.
//:- parameter rules same as a method concept.
//:- it is called automatically when the object creation.
//:- No return statement
//:- If Developer not created any constructor then behind the scene JVM included default zero para constructor.
//:- multiple constructor within a class called constructor overloading.

//need: - IF we need to executed something whenever you create the object then used Constructor

class Demo1
{
    int age;
    String name;
/*
    public void setData(int age, String name)
    {
        this.age = age;
        this.name = name;
    }*/

    // in place of common method we can use constructor

    public Demo1(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    // getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
public class code01 {
    public static void main(String[] args) {

        Demo1 d1= new Demo1(21, "Vrij Verma") ; // parametrized constructor

        System.out.println(d1.name);
        System.out.println(d1.age);

    }
}
