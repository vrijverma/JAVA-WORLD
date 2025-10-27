package oops.lambdaExpression;
interface LambdaEx02
{
    int add(int a , int b);
}
public class LE02 {
    public static void main(String[] args) {


        // Way 1
        /*LambdaEx02 lb1 = (int a,int b) ->
        {
            int result = a+b;
           return result;
        };
        System.out.println(lb1.add(10,20));*/


        LambdaEx02 lb1 = ( a,b) ->
        {
            return a+b;
        };
        System.out.println(lb1.add(10,20));


    }
}
