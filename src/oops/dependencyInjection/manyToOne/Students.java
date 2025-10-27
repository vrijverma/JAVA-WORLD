package oops.dependencyInjection.manyToOne;

// Many students have joined with a single branch
public class Students {
    private int sId;
    private String stuName;
    private Branch branch;  // HAS-A relationship

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public void getData() {
        System.out.println("Student Details --------");
        System.out.println("ID    : " + sId);
        System.out.println("Name  : " + stuName);
        System.out.println("Branch ID   : " + branch.getbId());
        System.out.println("Branch Name : " + branch.getbName());
        System.out.println("-----------------------------");
    }
}
