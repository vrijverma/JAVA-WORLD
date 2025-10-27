package var_args_method;

// JDK 1.0
//in this example we wrote code in method overloading mean same name but different parameter.
// Disadvantage :  length of code increase if we add 4 argument method like that then again we need to write another method.

// JDK 1.5 :  Single method can handle the n number of arguments but all should be same type.
class DemoVarArgs
{
    public int m1(int a)
    {
        return a;
    }
    public int m2(int a, int b)
    {
        return a+b;
    }
    public int m3(int a, int b,int c)
    {
        return a+b+c;
    }
}
public class Ex01 {
    public static void main(String[] args) {

        DemoVarArgs d1 = new DemoVarArgs();
        d1.m1(10);
        d1.m2(10,20);
        d1.m3(10,20,40);

    }
}
