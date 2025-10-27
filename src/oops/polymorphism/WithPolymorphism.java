package oops.polymorphism;

class Parent1
{
    public  void cry()
    {
        System.out.println("Parent crying...");
    }
}
class Child11 extends Parent1
{
    public  void cry()
    {
        System.out.println("Child1 crying...");
    }
    public void eat()
    {
        System.out.println("Child1 eat more");
    }
}

public class WithPolymorphism {
    public static void main(String[] args) {

        Parent1 p1 = new Child11();
        p1.cry();
//        p1.eat(); directly using parent type reference we cannot access child class object

        // Down casting : when you want to access specialized method..
        ((Child11) p1).eat(); // down casting..
    }
}
