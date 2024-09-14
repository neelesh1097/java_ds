//import java.util.Scanner;
//
//public class add_array {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//
//        // Read the sizes of the two arrays
//        int n1 = scn.nextInt(); // size of the first array
//        int[] a1 = new int[n1]; // first array
//
//        // Read elements for the first array
//        for (int i = 0; i < n1; i++) {
//            a1[i] = scn.nextInt();
//        }
//
//        int n2 = scn.nextInt(); // size of the second array
//        int[] a2 = new int[n2]; // second array
//
//        // Read elements for the second array
//        for (int i = 0; i < n2; i++) {
//            a2[i] = scn.nextInt();
//        }
//
//        // Create a result array to store the sum, with an extra space for a carry
//        int[] sum = new int[Math.max(n1, n2) + 1];
//        int carry = 0;  // Initialize carry
//
//        int i = a1.length - 1;  // Pointer for the first array
//        int j = a2.length - 1;  // Pointer for the second array
//        int k = sum.length - 1;  // Pointer for the result array
//
//        // Loop until all digits are processed
//        while (i >= 0 || j >= 0) {
//            int digitSum = carry;  // Start with the carry from the previous iteration
//
//            if (i >= 0) {
//                digitSum += a1[i];  // Add the current digit from a1
//                i--;
//            }
//            if (j >= 0) {
//                digitSum += a2[j];  // Add the current digit from a2
//                j--;
//            }
//
//            carry = digitSum / 10;  // Calculate the new carry
//            sum[k] = digitSum % 10;  // Store the last digit in the result array
//            k--;
//        }
//
//        // If there is a carry left after the loop, store it in the first position
//        sum[k] = carry;
//
//        // Print the result, ignoring leading zeros
//        boolean leadingZero = true;
//        for (int x = 0; x < sum.length; x++) {
//            if (sum[x] == 0 && leadingZero) {
//                continue; // Skip leading zeros
//            } else {
//                leadingZero = false; // Once a non-zero is encountered, start printing
//                System.out.print(sum[x]);
//            }
//        }
//    }
//}
