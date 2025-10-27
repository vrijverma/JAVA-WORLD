package oops.staticc;

import java.util.Scanner;

class SI
{
    private float pa;
    private float td;
    private static float ri;
    private float si;



    static {
        ri = 2.5f;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle amount...");
        pa = sc.nextInt();

        System.out.println("Enter time duration...");
        td = sc.nextInt();
    }

    public void compute()
    {
        si = (pa*ri*td)/100.0f;
    }

    public void disp()
    {
        System.out.println("SI : "+si);
    }
}
public class SimpleInterest {
    public static void main(String[] args) {

        SI obj = new SI();
        obj.input();
        obj.compute();
        obj.disp();
    }
}

// whenever a common copy data has to be share among all the object of the class -----> static