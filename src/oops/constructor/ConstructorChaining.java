package oops.constructor;

// Constructor chaining :  calling one constructor to the another constructor
// either we call same class constructor or parent class constructor
class Demo3
{
    int age;
    String city;

    public Demo3(int age, String city)
    {
//        super();
        this();
        this.age = age;
        this.city = city;
    }
    public Demo3()
    {
        this("Vrij");
       age = 21;
       city = "Patna";
    }
    public Demo3(String city)
    {
        super();
        this.city = city;
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {

    }
}
