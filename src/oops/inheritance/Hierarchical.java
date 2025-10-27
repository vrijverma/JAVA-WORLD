package oops.inheritance;


// One parent class can have any no of child classes called Hierarchical inheritance .
// mixer of Hierarchical inheritance and Multilevel called Hybrid Inheritance.

// Multiple inheritance is not  allowed in java
class Demo111
{
    private int age = 20 ;
    void disp()
    {
        System.out.println(age);
    }
}
class Demo222 extends  Demo111
{

}
class Demo333 extends Demo111
{

}


public class Hierarchical {
    public static void main(String[] args) {

        Demo333 d3 = new Demo333();
        d3.disp();

    }
}
