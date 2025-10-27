package oops.polymorphism;

class Parent
{
    public void cry()
    {
        System.out.println("Parent crying...");
    }
}
class Child1 extends Parent
{
    public void cry()
    {
        System.out.println("Child1 cries at high voice ...");
    }
}
class Child2 extends Parent
{
    public void cry()
    {
        System.out.println("Child2 cries at low voice ...");
    }
}
public class WithoutPolymorphism {
    public static void main(String[] args) {

        // tight coupling :  Creating child type reference for child type object
        // For Child1 reference type is Child1.
        // Whatever type of object the reference must be same.
        // this type of program we call it tightly coupling
        // in this case we not achieve polymorphism..

        // in one case we can change the reference type if reference type is parent type
        // called as loose coupling.
//        like : Parent c1 = new Chile1();

        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

//        c1.cry();
//        c2.cry();

      /*  if this way is correct then
        int a ;
        a = 10;*/

        // then we can write this object this way also...
        Parent ref;
        ref = c1;
        c1.cry(); //1:M : here ref doing work multiple (for c1 and c2 )

        ref = c2;
        c2.cry(); // 1:M

        // NOTE : this is not a actual way to achieve polymorphism



    }
}
