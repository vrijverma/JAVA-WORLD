package oops.encapsulation;

class Encap5
{
    int age;
    String name;

    // yes common setters is possible because return type is void or same
    // but common getters is not possible because every data have different return type.

    public void setData(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
public class Encapsulation5 {
    public static void main(String[] args) {

        Encap5 ref = new Encap5();
        ref.setData(21,"Vrij Verma");

        System.out.println(ref.getName());
        System.out.println(ref.getAge());

    }
}
