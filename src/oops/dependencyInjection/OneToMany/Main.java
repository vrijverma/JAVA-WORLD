package oops.dependencyInjection.OneToMany;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee(01,"Vrij Verma","Patna");
        Employee emp2 = new Employee(02,"Vrij Verma","Patna");
        Employee emp3 = new Employee(03,"Vrij Verma","Patna");

        Employee[] employees = new Employee[3];
        employees[0] = emp1;
        employees[1] = emp2;
        employees[2] = emp3;
        Department dept1 =   new Department(101,"Operation", employees);
        dept1.getEmpDetails();
    }
}
