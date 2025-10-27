package oops.dependencyInjection.OneToMany;


//import oops.dependencyInjection.oneToOne.Employee;

// Target Object
public class Department {

        private int depatmentId;
        private String departmentName;

        // Many employee so that we used array
        private Employee[]  employee;

    public Department(int depatmentId, String departmentName, Employee[] employee) {
        this.depatmentId = depatmentId;
        this.departmentName = departmentName;
        this.employee = employee;
    }
    public void getEmpDetails()
    {
        System.out.println("Department  details.......");
        System.out.println("Department Id  ::"+ depatmentId);
        System.out.println("Department name ::"+ departmentName);

        System.out.println("Employee details............");

        for(Employee emp : employee)
        {
            System.out.println("Employee id : "+ emp.empId);
            System.out.println("Employee id : "+ emp.empName);
            System.out.println("Employee id : "+ emp.empAddr);
        }


    }


}
