package oops.staticc;

class BestWay
{
    int a ;
    int b ;
    String name;

    static int count;

    // instate of using every time count in every constructor we can write count in static block
    // because behind the in the constructor first line java block execute.


 /* // Constructor
    BestWay()
    {
        count++;
    }
    BestWay(int a)
    {
        this.a = a;
        count++;
    }
    BestWay(String name, int b)
    {
        count++;
    }*/

    {
        count++;
    }
    BestWay()
    {

        /*{
            java block
        }*/
    }
    BestWay(int a)
    {
        this.a = a;

    }
    BestWay(String name, int b)
    {
        this.name = name;
        this.b = b;
    }


}
public class CountObject2 {
    public static void main(String[] args) {
        BestWay b1 = new BestWay();
        BestWay b2 = new BestWay(10);
        BestWay b3 = new BestWay("Vrij",10);

        System.out.println(BestWay.count);
    }
}
