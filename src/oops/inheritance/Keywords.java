package oops.inheritance;

// super keyword used for calling parent class instance variable.

class A
{
   int age  = 10;

}
class B extends A
{
   int  age = 100;
   void disp()
   {
       System.out.println(super.age); // 10
   }
}
public class Keywords {
    public static void main(String[] args) {
        B b = new B();
        b.disp();

    }
}
