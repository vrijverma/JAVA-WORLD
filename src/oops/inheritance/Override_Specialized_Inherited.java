package oops.inheritance;

class Parent
{
    public void drink()
    {
        System.out.println("Parent drink alcohol..");
    }
}
class Child extends Parent
{
    //  Inherited method : A method which are inherited from the parent and used as it is called inherited method.
    // Overridden method : A method which are inherited from the parent and in the child as per the need modify called Ove..
//    Specialized method : A method only in the child called specialized method.


    public void drink()
    {
        System.out.println("Child drink water..");
    }

    // specialized method
    public void smoke()
    {
        System.out.println("child smoke");
    }


}
public class Override_Specialized_Inherited {
    public static void main(String[] args) {

        Child child = new Child();
        child.drink();
        child.smoke();
    }
}
