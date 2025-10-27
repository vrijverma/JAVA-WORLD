package oops.inheritance;

class Plane
{
    public void takeOff()
    {
        System.out.println("Plane is takeOff..");
    }
    public void fly()
    {
        System.out.println("Plane is flying..");
    }
    public void landing()
    {
        System.out.println("Plane is landing..");
    }
}
class CargoPlane extends Plane
{

    // Override method
    public void fly()
    {
        System.out.println("CargoPlane is flies at lower height..");
    }

    // specialized method
    public void carryGoods()
    {
        System.out.println("Cargo plane carries goods");
    }
}
class PassengerPlane extends Plane
{
    // Override method
    public void fly()
    {
        System.out.println("PassengerPlane is flies at medium height..");
    }

    // specialized method
    public void carryPassenger()
    {
        System.out.println("Cargo plane carries Passengers.");
    }
}
public class ExampleOfMethods {
    public static void main(String[] args) {
        PassengerPlane pp = new PassengerPlane();
        CargoPlane cp = new CargoPlane();

        pp.takeOff(); // inherited method
        pp.fly(); // Overridden method
        pp.carryPassenger(); //specialized method
        pp.landing(); // inherited method

        cp.takeOff(); // inherited method
        cp.fly(); // Overridden method
        cp.carryGoods(); //specialized method
        cp.landing(); // inherited method


        // RULES :
//         1. We can not reduce the visibility of inherited or overridden.
//         2. Return type of overridden method must be same as that of overriding method in parent.
//         3. Return type of overridden method in child class can be different as that of parent class
//                if it is co-variant return type(return type is-a relationship).
//         4. Parameter of overridden method must be same that of parent else
//                it will consider as specialized method.

    }
}
