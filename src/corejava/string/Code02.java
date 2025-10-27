package corejava.string;

public class Code02 {
    public static void main(String[] args) {

//        CASE1
//      Here we use mutable String mean s1 refer to same object
        // we can change in same object
        StringBuffer s1 = new StringBuffer("Pankaj");
        s1.append("Kumar");
        System.out.println(s1); // PankajKumar


    }
}
