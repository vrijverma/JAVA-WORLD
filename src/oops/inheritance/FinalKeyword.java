package oops.inheritance;
// final keyword will apply on  :  class , variable  as well as method.

// final
/* final class ClassA
{

}
class ClassB extends ClassA // // final class will not participate in inheritance .
{

}*/


// final will inherit but we can not override
class ClassA
{
    final int a  = 10;
    final public void disp()
    {
//        a = 20; final variable act as constant we can not change the value
        System.out.println(a);
        System.out.println("parent class method");
    }
}
class ClassB extends ClassA
{

}
public class FinalKeyword {
    public static void main(String[] args) {
        ClassB classb = new ClassB();
        classb.disp();
    }
}
