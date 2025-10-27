package Patterns;

public class Alphabet {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i < n; i++) {
            // ---- H ----
            for (int j = 0; j < n; j++)
            {
                if (j == 0 || j == n - 1 || i == n / 2) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }

            // ---- GAP between H and I ----
            System.out.print("   ");

            // ---- I ----
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n / 2) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }

            // for gap
            System.out.print("   ");

            // ---A----
            for (int j = 0; j < n; j++)
            {
                if ((j==0 && i!=0) ||
                        (i==0 && j!=0 && j!=(n-1)) ||
                        (j==(n-1) && i!=0) ||
                        (i== (n-1)/2))
                {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            // for gap
            System.out.print("   ");

            // ---A----
            for (int j = 0; j < n; j++)
            {
                if(i==0)
                {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // move to next line
        }
    }
}
