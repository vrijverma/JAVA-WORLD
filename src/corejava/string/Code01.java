package corejava.string;

public class Code01 {
    public static void main(String[] args) {

//        CASE1 : String is immutable in nature so every time create new object
//        in this example you trying to add "kumar" in same object but internally
//        s1 refer to "Pankaj" object
//        and 2nd line "kumar" is second object which is not referred by s1
//        so that "Kumar" object in heap Area is Garbage value because not pointing to anyone.
        String s1 = "Pankaj";
        s1.concat("Kumar");
        System.out.println(s1); // Pankaj


    }
}
