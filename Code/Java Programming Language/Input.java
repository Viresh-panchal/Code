import java.util.Scanner;
public class Input {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //next nextLine nextInt nextByte nextFloat nextDouble nextBoolean nextShort nextLong
        //int b = sc.nextInt();
        //int sum = a + b;
        //System.out.println("Total of two numbers are " + sum );
        //int product = a * b;
        //System.out.println(product);
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);
        sc.close();
    }
}