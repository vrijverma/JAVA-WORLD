package oops.interfacec;

/*interface Demo{
    // class and interface both follow pascals naming conversion
    // then how to differentiate ?
}*/

// Best way to declare  interface name

// use I along with name
interface IDemo
{

    // 100% abstraction
    // by default method will be public and abstract

    void m1();
    void m2();

}

// best way to write implementation class
class DemoImpl implements IDemo
{
    public void m1()
    {
        System.out.println("m1 method...");
    }
    public void m2()
    {
        System.out.println("m2 method...");
    }
}
public class Demo01 {
    public static void main(String[] args) {

        IDemo obj1  = new DemoImpl(); // loose coupling
        obj1.m1();
        obj1.m2();
    }
}
