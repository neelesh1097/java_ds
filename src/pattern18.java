//import java.util.Scanner;
//
//public class pattern18 {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt(); // Input the size (should be an odd number)
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//
//                // Upper left and upper middle arms of the swastika
//                if (i == 1 && (j >= n / 2 + 1 || j == 1)) {
//                    System.out.print("*\t");
//                }
//                // Left vertical arm and middle part
//                else if (i <= n / 2 && (j == 1 || j == n / 2 + 1)) {
//                    System.out.print("*\t");
//                }
//                // Horizontal line in the middle of the swastika
//                else if (i == n / 2 + 1) {
//                    System.out.print("*\t");
//                }
//                // Lower left and lower middle arms of the swastika
//                else if (i > n / 2 + 1 && (j == n / 2 + 1 || j == n)) {
//                    System.out.print("*\t");
//                }
//                // Bottom right and bottom horizontal arm
//                else if (i == n && (j <= n / 2 + 1 || j == n)) {
//                    System.out.print("*\t");
//                }
//                // Top right vertical arm
//                else if (i >= n / 2 + 1 && j == n) {
//                    System.out.print("*\t");
//                }
//                // Spaces for empty positions
//                else {
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
