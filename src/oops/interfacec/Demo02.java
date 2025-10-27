package oops.interfacec;

interface IDemo1
{

    // 100% abstraction
    // by default method will be public and abstract

    void m1();
    void m2();
}

// best way to write implementation class
abstract class Demo1Impl implements IDemo
{
    public void m1()
    {
        System.out.println("m1 method...");
    }
    // if you not define of any one class the class then it get error

    // and if any single method have abstract then class must be declared as abstract.

    public abstract void m2();

}
public class Demo02 {
    public static void main(String[] args) {

//        Demo1Impl obj1  = new Demo1Impl(); // error : we can not create the object of abstract class
//        obj1.m1();
//        obj1.m2();


    }
}
