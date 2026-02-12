package lecture9;

import java.util.Scanner;

public class sumofN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sum(n);
    }
        public static void sum(int n) {
            int x = (n*(n+1))/2;
            System.out.print (x);
        }
}