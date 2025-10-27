package oops.dependencyInjection.oneToOne;

// One-to-one Association : One Employee has a single Account
// Dependent Object
public class Account {

    int accNo;
    String accName;
    String accType;

    // Constructor
    public Account(int accNo, String accName, String accType) {
        this.accNo = accNo;
        this.accName = accName;
        this.accType = accType;
    }
}
