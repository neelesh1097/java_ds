//import java.util.Scanner;
//
//public class transpose_matrix {
//    public static void main (String[] args){
//        Scanner scn = new Scanner(System.in);
//
//        int n = scn.nextInt();
//        int m = scn.nextInt();
//
//        int[][] arr= new int[n][m];
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                arr[i][j] = scn.nextInt();
//            }
//        }
//
//        for(int i=0; i<n; i++){
//            for(int j=i+1; j<m; j++){
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//
//
//
//        System.out.println("Resultant Matrix:");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
