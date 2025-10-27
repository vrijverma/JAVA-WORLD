package oops.abstraction;

// abstraction : Hiding actual implementation showing only features.
// Using abstract we not achieve 100% abstraction.
// but using Interface ---> yes

// abstract method : only method signature will be there body will not be there
// In a class if any one method abstract then class must be declared as abstract.

// in Abstract class normal concrete method also
// abstract keyword cannot be used for variable like : abstract int a  = 10 --> X

// if child class extending the abstract class then either have to implement abstract methods
//            Or declare class as abstract.

//Constructor cannot be made as abstract. (because super() present in constructor)

// we cannot abstract class as final because final class does not participate in inheritance
//why ? if does not extract the method then how can you implement the method.

// Abstraction and polymorphism both are inheritance dependent to ch

abstract class ATM
{
    abstract public void withdrawal();
    abstract public void deposit();
    abstract public void transfer();

    // in Abstract class normal concrete method also
    public void disp()
    {
        System.out.println("method body");
    }
}
class Customer extends ATM
{
    public void withdrawal()
    {
        System.out.println("100$ withdraw by customer..");
    }
    public void deposit()
    {
        System.out.println("500$ deposited by customer..");
    }
    public void transfer()
    {

        System.out.println("20$ transfer to his friend..");
    }

}
public class Ex01 {
    public static void main(String[] args) {

        // we can create ref of abstract class.
        ATM atm = new Customer();
        atm.deposit();
        atm.transfer();
        atm.withdrawal();

        // but we can not create of object
        // reason can not store the body then why we create the object
//            ATM atm1 = new ATM(); // error

    }
}
