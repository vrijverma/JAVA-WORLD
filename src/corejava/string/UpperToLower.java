package corejava.string;

public class UpperToLower {
    public static void main(String[] args) {

        // a=97
        // A=65

        String s1 = "VRIJ";
        String s2 = "";

        for(int i=0;i<s1.length();i++)
        {
            s2=s2+ (char) (s1.charAt(i)+32);
        }
        System.out.println(s2);
    }
}
