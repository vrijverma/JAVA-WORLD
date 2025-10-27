package oops.encapsulation;

class Encap2
{
    // :- Requirement is the data someone out side the class they give
    // :- If the class all the data member as private technically called Bean.
    private int age;
    private String name;
    private String city;

    // this is doing a activity of receiving data from outside and setting to its data member called as setters method
    void setAge(int a)
    {
        age = a;
    }
    // if someone access the data from another class we have getters method
    int getAge()
    {
        return age;
    }
    void setName(String n)
    {
        name = n;
    }
    
}
public class Encapsulation2 {
    public static void main(String[] args) {

        Encap2 e2 = new Encap2();

        // access denied here because instance variable declared as private
        /*e2.name = "Vrij";
        e2.age = 21;
        e2.city = "Patna";*/

        // if we want to access the used Setters and getters methods concept
        e2.setAge(21);



    }
}
