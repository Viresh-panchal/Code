package After_Patterns_Assignment;

public class binocoeff {
    public static int factorial (int z) {
        int f = 1;
        for (int i = 1; i <= z; i ++) {
            f = f * i;
        }
        return f;
    }
    public static int binocoef (int n, int r) {
        
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int bincoef = fact_n / (fact_r * fact_nmr);
        return bincoef;
    }
    public static void main (String args []) {
        System.out.println(binocoef(5, 2));
        System.out.println(factorial(4));
    }    
}
