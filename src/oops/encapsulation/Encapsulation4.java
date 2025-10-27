package oops.encapsulation;
class Encap4
{
    // Avoiding Shadowing problem we used this keyword.
    // this keyword is referred to current object.
    int age;
    String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }
}

public class Encapsulation4 {
    public static void main(String[] args) {

        Encap4 e2  = new Encap4();
        e2.setAge(21);
        e2.setName("Vrij");

        System.out.println(e2.getAge());
        System.out.println(e2.getName());

    }
}
