package After_Patterns_Assignment;
// #1
// public class Patterns {
//     public static void main (String args []) {
//         int line = 4;
//         int str = 3;
//         int count = 1;
//         for (int str1 = 1; str1 <= line; str1++) {
//             System.out.println();
//             System.out.print("* ");
//             if (count == 2 || count == 3) {
//                 System.out.print("      ");
//             } else 
//                 {
//                     for (int str2 = 1; str2 <= str; str2++){
//                         System.out.print("* ");
//                     }
//                 }
//             System.out.print("*");
//             count++;
//         }
//     }
// }
// #2
// public class Patterns {
//     public static void main (String args []) {
//         int line = 4;
//         int count = 3;
//         int str = 1;
//         int spc = 3;
//         for (int str1 = 1; str1 <= line; str1++) {
//             System.out.println();
//             do {
//                 System.out.print("  ");
//                 count--;
//             } while (count >= 0);
//                 for (int str2 = 1; str2 <= str; str2++) {
//                 System.out.print(" *");
//                 }
//             spc--;
//             count = spc;
//             str++;
//         }
//     }
// }
// #3
// public class Patterns {
//     public static void main (String args []) {
//         int line = 5;
//         int num3 = 5;
//         for (int num1 = 1; num1 <= line; num1++) {
//             System.out.println();
//             for (int num2 = 1; num2 <= num3; num2++) {
//                 System.out.print(num2 + " ");
//             }
//         num3--;
//         }
//     }
// }
// #4
// public class Patterns {
//     public static void main (String args []) {
//         int line = 5;
//         int num = 1;
//         int row = 1;
//         for (int num1 = 1; num1 <= line; num1++) {
//             System.out.println();
//             for (int num2 = 1; num2 <= row; num2++) {
//                 System.out.print(num + " ");
//                 num++;
//             }
//         row++;
//         }
//     }
// }
// #5
// public class Patterns {
//     public static void main (String args []) {
//         int line = 5;
//         boolean num = false;
//         int row = 1;
//         int count = 1;
//         for (int num1 = 1; num1 <= line; num1++) {
//             System.out.println();
//             for (int num2 =1; num2 <= row; num2++) {
//                 num =! num;
//                 if (num == true) {
//                     System.out.print("1");
//                     count++;
//                 } else if (count == 4 || count == 11) {
//                     System.out.print("1");
//                     count++;
//                     num =! num;
//                 } else {
//                     System.out.print("0");
//                     count++;
//                 }
//             }
//             row++;
//         }
//     }
// }
// #6
// import java.util.*;
// public class Patterns {
//     public static void main(String args []) {
//         Scanner sc = new Scanner (System.in);
//         int wings = sc.nextInt();
//         for (int i = 1; i <= wings; i++) {
//             System.out.println();
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             int spaces = 2 * (wings - i);
//             for (int j = 1; j <= spaces; j++) {
//             System.out.print("  ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//         }
//         for (int i = wings; i >= 1; i--) {
//             System.out.println();
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             int spaces = 2 * (wings - i);
//             for (int j = 1; j <= spaces; j++) {
//             System.out.print("  ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//         }
//         sc.close();
//     }
// }
// #7
// public class Patterns {
//     public static void main(String args []) {
//         int line = 5;
//         for (int i = 1; i <= line; i++) {
//             System.out.println();
//             int spaces = line - i;
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <= 1; j++) {
//                 System.out.print("* * * * *");
//             }
//         }
//     }   
// }
// #8
// public class Patterns {
//     public static void main (String args []) {
//         int line = 5;
//         int str = 5;
//         int count = 0;
//         for (int i = 1; i <= line; i++) {
//             System.out.println();
//             int spaces = line - i;
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <= str; j++) {
//                 count++;
//                 if (count >= 7 && count <=9 || count >= 12 && count <= 14 || count >= 17 && count <= 19) {
//                     System.out.print("  ");
//                     continue;
//                 }
//                 System.out.print("* ");
//             }
//         }
//     }
// }
// #9
// public class Patterns {
//     public static void main (String args []) {
//         int line = 4;
//         for (int i = 1; i <= line; i++) {
//             System.out.println();
//             int spaces = line - i;
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             for (int j = 2; j <= i; j++) {
//                 System.out.print("* ");
//             }
//         }
//         for (int i = line; i >= 1; i--) {
//             System.out.println();
//             int spaces = line - i;
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print("  ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             for (int j = 2; j <= i; j++) {
//                 System.out.print("* ");
//             }
//         }
//     }
// }
// #10
// public class Patterns {
//     public static void main (String args []) {
//         int line = 5;
//         for (int i = 1; i <= line; i++) {
//             System.out.println();
//             int spaces = line - i;
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }
// #11
// public class Patterns {
//     public static void main (String args []) {
//         int line = 5;
//         int num = 2;
//         for (int i = 1; i <= line; i++) {
//             System.out.println();
//             int spaces = line - i;
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(num-j);
//             }
//             for (int k = 2; k <= i; k++) {
//                 System.out.print(k);
//             }
//             num++;
//         }
//     }
// }