package oops.dependencyInjection.OneToMany;


// Dependent Object
public class Employee {

    int empId;
    String empName;
    String empAddr;

    public Employee(int empId, String empName, String empAddr) {
        this.empId = empId;
        this.empName = empName;
        this.empAddr = empAddr;
    }


}
