package oops.dependencyInjection.oneToOne;

// Target Object
public class Employee {

    private int empId;
    private String empName;
    private String empAddr;

    // HAS-A relationship
    Account account;

    public Employee(int empId, String empName, String empAddr, Account account) {
        this.empId = empId;
        this.empName = empName;
        this.empAddr = empAddr;
        this.account = account;
    }

    public void getEmpDetails()
    {
        System.out.println("Employee Details.......");
        System.out.println("Employee name  ::" + empName);
        System.out.println("Employee add  ::" + empAddr);
        System.out.println("Employee id   ::" + empId);

        System.out.println("Employee Account details.......");
        System.out.println("Employee Account No  ::"+ account.accNo);
        System.out.println("Employee Account name  ::"+ account.accName);
        System.out.println("Employee Account type  ::"+ account.accType);
    }

}
