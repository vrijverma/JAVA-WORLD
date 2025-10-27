package oops.inheritance;

// Inheritance : Code reusability
class Demo1
{
    int age = 10;
    String name = "vrij";

    public void disp() {
        System.out.println("data : " + age + name);
    }
}
class Demo2 extends Demo1
{
    // all the properties and behaviours inherited from Demo2 class
}

public class SingleInheritance {
    public static void main(String[] args) {

    }
}

// IS-A relationship / parent-child relationship/ base class - subclass relationship.

/*
    * Single inheritance is allowed : one class can extends another class.
    * Object class is parent of all classes.
    * Multilevel Inheritance is allowed
    *
* */