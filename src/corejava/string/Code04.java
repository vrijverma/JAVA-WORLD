package corejava.string;

public class Code04 {
    public static void main(String[] args) {

//        CASE4:


        StringBuilder s1 = new StringBuilder("Vrij");
        StringBuilder s2 = new StringBuilder("Vrij");

        System.out.println(s1==s2); // false
        System.out.println(s1.equals(s2)); // false

//      NOTE: StringBuilder class equals() compare the reference(address of the Object)not the content.


    }
}
