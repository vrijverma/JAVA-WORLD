package oops.lambdaExpression;

@FunctionalInterface // it is indication for Compiler also as well as Developer also
interface LambdaEx01
{
    // Only single method allow in Functional interface
    // Function Interface and Lambda Expression both work together
    //Lambda Expression :  un named method

    void disp1();
}
public class LE01 {
    public static void main(String[] args) {

            // we can not create object of interface, but we can create reference

        LambdaEx01 lm1 = () ->
        {
            System.out.println("Hey i am lambda ");
        };
    }
}
/*
    1. To write Lambda expression we use lambda operator (->)
    2. It is divided into two parts
    3. left side parameter and right side implementation or body.
    4. left side for parameters datatypes is optional
    5. write side if single statement then curly braces also optional.
    6. left side if parameter is single then data type is optional
    7. if single line then return statement is also optional.



 */
