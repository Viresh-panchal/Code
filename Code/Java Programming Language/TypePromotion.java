public class TypePromotion {
    public static void main (String args []) {
        /*
         * 1.) Java automatically promotes each byte,short, or char operand to int when evaluating an expression.
         * 2.) If one operand is long,float, or double the whole expression promoted to long,float, or double respectively.
         */
        char a = 'a';
        char b = 'b';
        System.out.println(a-b); 
        float c = 5.25f;
        long d = 25;
        double e = 50.5;
        double sum = a + b + c + d + e;
        int sum1 = (int) (a + b + c + d + e); 
        System.out.println(sum);
        System.out.println(sum1);
    }
}
