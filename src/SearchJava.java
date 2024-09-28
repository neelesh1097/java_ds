//import java.util.Scanner;
//
//public class SearchJava {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//
//        // Input for number of rows (n) and columns (m)
//        int n = scn.nextInt();
//        int m = scn.nextInt();
//
//        // Input for target element
//        int target = scn.nextInt();
//
//        // Declare the matrix
//        int[][] matrix = new int[n][m];
//
//        // Input elements into the matrix
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < m; j++) {
//                matrix[i][j] = scn.nextInt();  // Reading matrix elements
//            }
//        }
//
//        // Variable to track if the target is found
//        boolean found = false;
//
//        // Linear search for the target element
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (matrix[i][j] == target) {
//                    System.out.println("Element found at position (" + i + ", " + j + ")");
//                    found = true;
//                    break; // Break the inner loop once the element is found
//                }
//            }
//            if (found) break; // Break the outer loop as well
//        }
//
//        // Output result
//        if (found) {
//            System.out.println("Element found in the matrix.");
//        } else {
//            System.out.println("Element not found in the matrix.");
//        }
//    }
//}
