package oops.dependencyInjection.manyToOne;

public class Main {
    public static void main(String[] args) {
        Branch b1 = new Branch();
        b1.setbId(101);
        b1.setbName("MCA");

        Students stu1 = new Students();
        stu1.setsId(1);
        stu1.setStuName("Vrij Verma");
        stu1.setBranch(b1);
        Students stu2 = new Students();
        stu2.setsId(2);
        stu2.setStuName("Alok Kumar");
        stu2.setBranch(b1);

        // Print details
        stu1.getData();
        stu2.getData();
    }
}
