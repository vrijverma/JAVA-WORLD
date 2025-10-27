package oops.dependencyInjection.manyToOne;

// Dependent object
// first write always dependent code
public class Branch {

    int bId;
    String bName;

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }
}
