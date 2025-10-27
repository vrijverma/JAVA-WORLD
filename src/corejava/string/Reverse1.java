package corejava.string;

public class Reverse1 {
    public static void main(String[] args) {

        String name = "VrijVERma";
        String s2 = "";

        for (int i= name.length()-1;i>=0;i--)
        {
            s2 = s2+ name.charAt(i);
        }

        System.out.println("Original String : "+ name);
        System.out.println("After Reverse Str : "+s2);
    }
}
