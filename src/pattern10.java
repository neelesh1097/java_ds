//import java.util.Scanner;
//
//public class pattern10 {
//    public static void main(String[] args){
//        Scanner scn =new Scanner(System.in);
//
//        int n =scn.nextInt();
//
//        int os =2;
//        int st = 1;
//        int is = -1;
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=os; j++){
//                System.out.print("-");
//            }
//
//            for(int j=1; j<=st; j++){
//                System.out.print("*");
//            }
//
//            for(int j=1; j<=is; j++){
//                System.out.print("-");
//            }
//
//            if(i>1 && i<n){
//                System.out.print("*");
//            }
//
//
//            System.out.println(" ");
//
//
//            if(i<=n/2){
//                os -= 1;
//                is += 2;
//            }
//            else{
//                os +=1;
//                is -=2;
//            }
//
//
//
//        }
//    }
//
//}
//
//
//        --*
//        -*-*
//        *---*
//        -*-*
//        --*
