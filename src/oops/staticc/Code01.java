package oops.staticc;
class StaticDemo1
{
    // static variable
    static int a;
    static int b;

    // static block
    static
    {
        System.out.println("static block...");
        a = 10;
        b = 20;
    }
    // static method
    static void disp()
    {
        System.out.println("static method...");
        System.out.println(a);
        System.out.println(b);
    }

    // instance variable
    int x;
    int y;

    //normal java block
    {
        System.out.println("java block...");
        x = 30;
        y = 40;
    }
    // Constructor
    StaticDemo1 ()
    {
        System.out.println("constructor...");
    }

    // java method
    public void demo()
    {
        System.out.println("java method....");
        System.out.println(x);
        System.out.println(y);
    }

}
public class Code01 {
    public static void main(String[] args) {

        StaticDemo1.disp();
        StaticDemo1 d1 = new StaticDemo1();
        d1.demo();

    }
}

//NOTE: static variable can used anywhere like
//            1. inside static block
//            2. inside static method
//            3. inside non - static block
//            4. inside java  method

// REASON : static variable is object independent where as for instance variable
//            whenever we create object then memory allocated for those variable
//            so Instance variable Object dependent.


//       :- CONTROL FLOW OF EXECUTION:-
/*
            1. static variable.
            2. static block.
            3. static method.
            4. normal java block.
            5. constructor.
            6. java methods.*/
