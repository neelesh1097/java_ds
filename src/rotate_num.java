//import java.util.Scanner;
//
//public class rotate_num {
//    public static void main (String[] args){
//        Scanner scn = new Scanner(System.in);
//        int n= scn.nextInt();
//        int k= scn.nextInt();
//
//
//        int temp =n;
//        int nod =0;
//        while(temp!=0){
//            temp = temp/10;
//            nod++;
//        }
//        int div = (int)(Math.pow(10,k));
//
//        int p= n % div;
//        int q = n/div;
//
//        int s= nod -k;
//
//        int mul =(int)(Math.pow(10,s));
//
//        int result = p*mul + q;
//
//        System.out.print(result);
//
//
//
//    }
//}
