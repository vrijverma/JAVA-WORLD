package corejava.string;


public class mixString {
    public static void main(String[] args) {

        // INPUT : VrijVerMa;
        // OUTPUT : vRIJvERmA;

        String s1 = "VrijVerMa";
        String s2 = "";

        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
            {
                s2 = s2+(char) (s1.charAt(i)-32);
            }
            else
            {
                s2 = s2+(char) (s1.charAt(i)+32);
            }
        }
        System.out.println(s2);
    }
}
