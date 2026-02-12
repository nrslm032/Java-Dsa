package lecture9;

import java.util.Scanner;

public class simpleIn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("P : ");
        int P = sc.nextInt();
        System.out.print("R : ");
        int R = sc.nextInt();
        System.out.print("T : ");
        int T = sc.nextInt();

        SI(P,R,T);
    }
        public static void SI(int P,int R, int T) {
            int x = (P*R*T)/100;
            System.out.print("S.I : ");
            System.out.print (x);
     }
}