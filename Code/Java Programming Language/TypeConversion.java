public class TypeConversion {
    public static void main (String args[]) {
        /* 
         * 1.) type compatible [int can convert float but int cannot convert into boolean]
         * 2.) destination type > source type [long > int but long cant convert into int]
         * byte -> short -> int -> float -> long -> double
         */
        //int a = 25;
        //long b = a;
        long a = 25;
        int b = (int)a; // type casting we can force convert long into int now its run
        System.out.println(b);
        char ch = 'Z';
        char ch1 = 'z';
        System.out.println((int)(ch)); //type casting is possible a character letter convert into int
        System.out.println((int)(ch1)); //well a is 97 z is 122 A is 65 Z is 90
    }    
}
