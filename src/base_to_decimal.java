//import java.util.Scanner;
//
//public class base_to_decimal {
//    public static void main(String[] args){
//        Scanner scn =new Scanner(System.in);
//
//        int n= scn.nextInt();
//        int b= scn.nextInt();
//        int bd = basetodecimal(n,b);
//        System.out.println(bd);
//
//    }
//
//
//    public static int basetodecimal(int n , int b){
//        int rv =0;
//        int p = 1;
//        while(n != 0){
//            int dig = n%10;
//
//            n =n/10;
//
//            rv += dig*p;
//             p= p*b;
//        }
//
//        return rv;
//    }
//}
