package oops.polymorphism;

class Habits
{
    public void eat()
    {
        System.out.println("Always eat healthy food");
    }
    public void sleep()
    {
        System.out.println("sleep at leat 8 hours");
    }
}

class Student1 extends  Habits
{

    // specialized method
    public void drink()
    {
        System.out.println("he consume alcohol");
    }
}

class Student2 extends Habits
{
    public void dance()
    {
        System.out.println("he performed very well!");
    }
}
class CollegeData
{
    public void audit(Habits habits)
    {
        habits.eat();
        habits.sleep();

    }
}
public class WithPolymorphism1 {
    public static void main(String[] args) {


        Student1 stu1 = new Student1();
        Student2 stu2 = new Student2();

        CollegeData cd = new CollegeData();
        cd.audit(stu1);
        cd.audit(stu2);






    }
}
