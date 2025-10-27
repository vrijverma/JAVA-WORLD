package oops.interfacec;

// CASE4: A class can extend a class and can implement any no of interfaces
// but first should be extended then after implements.
class A

{
    void m1()
    {
        System.out.println("M1 method...");
    }
}
interface ISample
{
    void m2();
}

class Data extends A implements ISample
{

    @Override
    public void m2() {

    }
}
public class Demo04 {
    public static void main(String[] args) {

    }
}
