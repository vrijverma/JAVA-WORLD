package oops.constructor;

class Demo2
{
    int age;
    String name;

    // Constructor
    public Demo2(int age, String name) {
        //super(): call everytime parent class constructor.
        // super() : whether you write or do not write it call always parent class constructor.
        // in one case super() not be there if this() available.
        // super() and this() both should be in 1st line only.
        // in this example parent class is Object.
        super();
        this.age = age;
        this.name = name;
    }
}
public class Super_this_Method {
    public static void main(String[] args) {

    }
}
