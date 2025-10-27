package var_args_method;

class VarArgs01
{
    public void add(int... x)
    {
        // since it is arrayed we can use for each loop as well as we can add element in the array.

        int total = 0;
        for(int elem : x)
        {
            total = total + elem;

            System.out.print("total sum is : "+total);
            System.out.println(" ");
        }
        System.out.println();
    }
}
public class Ex03 {
    public static void main(String[] args) {

        VarArgs01 v1 = new VarArgs01();
        v1.add();
        v1.add(10);
        v1.add(10,20);
        v1.add(10,30,50,30);


    }
}
