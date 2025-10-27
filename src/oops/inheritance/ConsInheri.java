package oops.inheritance;

// Constructor will not participate in inheritance.
// however parent class will constructor get called because of super() method present in side the child class

class CondsIn1
{
    CondsIn1()
    {
        System.out.println("Parent class Constructor...");
    }
}
class CondsIn2 extends CondsIn1
{
    // here if programmer not mention any constructor the JVM or Compiler will make zero parameterize constructor
    /*
    CondsIn2
    {
        super(); // and this method will call parent class constructor
    }
    */
    void disp()
    {
        System.out.println("Child method");
    }
}
public class ConsInheri {
    public static void main(String[] args) {

        CondsIn2 c1 = new CondsIn2();
        c1.disp();


        /*
            Parent class Constructor...
            Child method*/
    }
}
