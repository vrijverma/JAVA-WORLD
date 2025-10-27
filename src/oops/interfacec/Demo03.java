package oops.interfacec;

interface One
{
    void methodOne(); // Default public abstract
}
interface Two
{
    void methodTwo();
}

// Two  or more interface can implement but two class can not be extends
class CommonImpl  implements  One, Two
{
    @Override
    public void methodOne()
    {
        System.out.println("Method One");
    }

    @Override
    public void methodTwo()
    {
        System.out.println("Method Two");
    }
}
public class Demo03 {
    public static void main(String[] args) {

    }
}
