package lecture9;

import java.util.Scanner;

public class SimpleIn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("P : ");
        int P = sc.nextInt();
        System.out.print("R : ");
        int R = sc.nextInt();
        System.out.print("T : ");
        int T = sc.nextInt();

        int x = SI(P,R,T);
        System.out.print (x);

    }
        public static int SI(int P,int R, int T) {
            int x = (P*R*T)/100;
            System.out.print("S.I : ");
            return x;
     }
     
}
