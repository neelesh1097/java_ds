//import java.util.Scanner;
//
//public class add_base {
//    public static void main(String[] args){
//        Scanner scn = new Scanner(System.in);
//
//        int n1= scn.nextInt();
//        int n2 =scn.nextInt();
//        int b =scn.nextInt();
//  int result = bases(n1 ,n2 ,b);
//  System.out.println(result);
//    }
//
//
//    public static int bases(int n1,int n2, int b){
//        int rv =0;
//
//        int c =0;
//        int p=1;
//         while(n1 > 0 || n2 > 0 || c>0){
//             int d1 =n1 % 10;
//             int d2 =n2 % 10;
//
//             n1 =n1/10;
//             n2 =n2/10;
//
//             int d =d1 +d2 +c;
//
//              c = d/b;
//             d = d%b;
//
//             rv += d * p;
//             p= p*10;
//
//
//         }
//         return rv;
//
//    }
//}
