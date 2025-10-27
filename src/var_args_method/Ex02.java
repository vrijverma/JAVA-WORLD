package var_args_method;

// it stands for "Variable Arguments Method";
// in java language, if we have variable no of arguments , then compulsorily new method has to be written till jdk 1.4
// but jdk 1.5v : we can write single method which can handle n numbers of arguments(but all of them should be same type)

// ... => called ellipse.
class VarArgsDemo2
{
    public void data1(int... x)
    {
        System.out.println(" var - args method");
    }


}
public class Ex02 {
    public static void main(String[] args) {

        VarArgsDemo2 v1 = new VarArgsDemo2();
        v1.data1(10); // new int[]{10};
        v1.data1(10,20);// new int[]{10,20};
        v1.data1(10,30,40);// new int[]{10,30,40};

        // see here we pass different parameter but handled by single method.
        // how it works : behind it is created an array.
    }
}
