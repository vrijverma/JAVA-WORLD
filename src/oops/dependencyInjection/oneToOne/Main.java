package oops.dependencyInjection.oneToOne;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(111, "Vrij","Saving");

        // constructor injection
        Employee emp = new Employee(1,"Vrij verma","Patna", acc);
        emp.getEmpDetails();



    }
}
