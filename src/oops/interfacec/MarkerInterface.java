package oops.interfacec;

//Marker Interface : Interface without any methods
//like: Serializable , Cloneable ....


interface IDemoo1
{
    void m1();
    void m2();
    void m3();

}

//class AdapterClass implements IDemo1
//{
//    public void m1()
//    {
//
//    }
//
//    // Note : if you not give  implementation of all method then it get Error
//    // that why we used A
//}


// abstract why ? : If we not give the body then no benefits of creating of this class object
                    // so that we declare as abstract

abstract class AdapterClass implements IDemoo1
{
    public void m1(){}
    public void m2(){}
    public void m3(){}

}

class Demo2Impl extends  AdapterClass
{
    public void m1()
    {
        System.out.println(" hey i can give implementation..");
    }
}
public class MarkerInterface {
    public static void main(String[] args) {

        Demo2Impl d2 = new Demo2Impl();
        d2.m1();
    }
}

// when to use interface, abstract and concrete class
// noting i know about the implementation : interface
// partial i know then go for abstract class
// Complete implementation and ready to go service : Concrete class