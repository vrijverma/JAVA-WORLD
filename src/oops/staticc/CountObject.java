package oops.staticc;

class CountObj
{
    int a;
    int b;

    static int count; // static variable shared same copy among all the object that why called as class variable

    // Constructor
    CountObj()
    {
        count++;
    }

}
public class CountObject {
    public static void main(String[] args) {

        CountObj c1 = new CountObj();
        CountObj c2 = new CountObj();
        CountObj c3 = new CountObj();

        System.out.println(CountObj.count); // 3



    }
}
