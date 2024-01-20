import java.util.Scanner;
public class Assignment {
public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number :");
    int n = sc.nextInt();
    isPalindrome(n);
    sc.close();
    }
    public static int isPalindrome(int n) {
        int dt = n / 10;
        for(int i = 0; i < dt ; i++) {
            int revn = dt;
        if (n == revn) {
            System.out.println("Its Palindrome "+ n);
        } else {
            System.out.println("Its not Palindrome "+ n);
        }
        System.out.println(revn);
    }return n;
    }
}