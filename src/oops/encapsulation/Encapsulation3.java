package oops.encapsulation;

class Encap3
{
    // Shadowing problem :
    // whenever there is name conflict between instance variable and local variable  call shadowing problem.

    int age;
    String name ;

    void setAge(int age)
    {
        age = age; // here conflict between local and instance variable
    }
    int getAge()
    {
        return age;
    }


}
public class Encapsulation3 {
    public static void main(String[] args) {

    }
}
