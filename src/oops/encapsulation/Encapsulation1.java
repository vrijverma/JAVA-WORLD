package oops.encapsulation;
class Encap1
{
    // Encapsulation : Data hiding / Data Binding / Providing Security..

//    NOTE: in this program we not apply Encapsulation concept, this is only for : need of Encapsulation
    // Instance Variable/ Data member/ Properties...
    int age;
    String name;
    String city;
}
public class Encapsulation1 {
    public static void main(String[] args) {

        // Object creation... is also called Instantiation(creation of object)
        Encap1 en1 = new Encap1();
        en1.age = 21;
        en1.name = "Vrij";
        en1.city = "Patna";

        // here problem is we can access easily instance variable of another class
        // we can update of data from another class easily
        // Avoiding this thing we used Encapsulation

        // we Achieved encapsulation using private keyword
        // after that if you want access those  instance variable in another class then
        // we can be use setters and getters concept.





    }
}
