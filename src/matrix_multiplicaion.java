//import java.util.Scanner;
//
//public class matrix_multiplicaion {
//    public static void main(String[] args){
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the number of rows and columns for the first matrix:");
//        int n1 = scn.nextInt();
//        int m1 = scn.nextInt();
//
//        int[][] mat1 = new int[n1][m1];
//
//        for(int i=0; i<n1; i++){
//            for(int j=0; j<m1; j++){
//                mat1[i][j] = scn.nextInt();
//            }
//        }
//        System.out.println("Enter the number of rows and columns for the second matrix:");
//        int n2 = scn.nextInt();
//        int m2 = scn.nextInt();
//
//        int[][] mat2 = new int[n2][m2];
//
//        if (m1 != n2) {
//            System.out.println("Matrix multiplication is not possible. The number of columns in the first matrix must equal the number of rows in the second matrix.");
//            return;
//        }
//
//        for(int i=0; i<n1; i++){
//            for(int j=0; j<m1; j++){
//                mat2[i][j] = scn.nextInt();
//            }
//        }
//
//        int [][] result = new int[n1][m2];
//        for(int i=0; i<n1; i++){
//            for(int j=0; j<m2; j++){
//                for (int k = 0; k < m1; k++) {
//                    result[i][j] += mat1[i][k] * mat2[k][j];
//                }
//            }
//        }
//        System.out.println("Resultant Matrix:");
//        for (int i = 0; i < n1; i++) {
//            for (int j = 0; j < m2; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        scn.close();
//
//
//    }
//}
