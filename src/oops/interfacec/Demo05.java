package oops.interfacec;

//CASE 4 :  An interface can extends any no of interfaces at time
interface IF1
{
    void m1();
}
interface IF2
{
    void m2();
}

interface IF3 extends IF1, IF2
{
    void m3();
}

class ExamImpl implements IF3{
    public void m1()
    {
        System.out.println("M1");
    }
    public void m2()
    {
        System.out.println("M2");
    }
    public void m3()
    {
        System.out.println("M3");
    }
}


public class Demo05 {
    public static void main(String[] args) {

        ExamImpl ei = new ExamImpl();
        ei.m1();
        ei.m2();
        ei.m3();
    }
}
