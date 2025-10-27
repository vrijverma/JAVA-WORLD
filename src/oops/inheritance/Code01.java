package oops.inheritance;
class DemoI
{
    private int age = 20 ;

    void disp1()
    {
        System.out.println(age);
    }
}

class DemoII extends DemoI
{
   void disp2()
   {
//       age = 30;
   }
}
public class Code01 {
    public static void main(String[] args) {

        DemoII d  = new DemoII();
        d.disp1();
//        d.disp2(); // error

    }
}

//  Private member will not participate in inheritance.
//  WHY ? : -  To preserve the Encapsulation Concept.
// Encapsulation said outside the class if member is private no one is access directly.


// Constructor will also not participate in inheritance
// WHY ? : - Constructor executing during the class loading or creation of object
            // if have two class like Parent and child class
            // and you create the object of child then how Parent class constructor executed
            // it is totally illogical.
