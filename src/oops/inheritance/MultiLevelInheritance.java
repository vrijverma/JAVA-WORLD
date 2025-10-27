package oops.inheritance;

// In java if you not specify any parent then behind the scene extending object class.
class Demo11 // extends Object
{
    private int age = 24;
    private String name = "Vrij";

    void disp(){
    System.out.println(age + name);
    }
}
class Demo22 extends Demo11
{

}
class Demo33 extends Demo22
{

}
public class MultiLevelInheritance {
    public static void main(String[] args) {

        Demo33 d3 = new Demo33();
        d3.disp();

    }
}
