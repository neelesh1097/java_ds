//import java.util.Scanner;
//
//public class Decimal_to_base {
//
//    public static void main(String[] args){
//        Scanner scn = new Scanner(System.in);
//
//        int n =scn.nextInt();
//        int b= scn.nextInt();
//        int dn = decimaltobase(n ,b);
//
//        System.out.print(dn);
//
//
//    }
//
//
//    public static int decimaltobase(int n , int b){
//
//        int rv =0;
//
//        int p=1;
//
//        while(n != 0){
//            int dig =n % b;
//
//            n =n/b;
//
//            rv += dig * p;
//            p =p * 10;
//
//
//        }
//
//        return rv;
//    }
//}
