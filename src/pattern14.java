//import java.util.Scanner;
//
//public class pattern14 {
//    public static void main (String[] args){
//        Scanner scn = new Scanner(System.in);
//
//        int n = scn.nextInt();
//
//        int sp =2;
//        int st =1;
//        int val =1;
//
//
//
//        for(int i= 1; i<=n; i++){
//            for(int j=1; j<=sp; j++){
//                System.out.print("\t"  + "-");
//
//            }
//            int cval =val;
//            for(int j=1; j<=st; j++){
//                System.out.print( "\t" + cval );
//                if(j <= st/2){
//                    cval++;
//                }
//                else{
//                    cval--;
//                }
//            }
//
//
//            System.out.println(" ");
//
//            if(i <= n/2){
//                sp--;
//                st+= 2;
//                val++;
//            }
//            else{
//                sp++;
//                st-=2;
//                val--;
//            }
//        }
//    }
//}
//
//
//	        -	-	1
//            -	2	3	2
//            3	4	5	4	3
//            -	2	3	2
//            -	-	1
