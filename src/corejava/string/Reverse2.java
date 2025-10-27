package corejava.string;

public class Reverse2 {
    public static void main(String[] args) {

        // OUTPUT should be  jirV amreV

        String s1 = "Vrij Verma";
        String s2 = "";

       String[] arr =  s1.split(""); // Vrij is 0th index and Verma on 1st index

        // for each loop tribal only in forward direction.....
        for(String elem : arr)
        {
          for (int i= elem.length()-1;i>=0;i--)
          {
              s2+= elem.charAt(i);
          }
          s2 = s2 +" ";
        }

        System.out.println(s2);

    }
}
