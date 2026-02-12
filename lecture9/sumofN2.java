package lecture9;

import java.util.Scanner;

public class sumofN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = sum(n);
        System.out.print(x);

    }
        public static int sum(int n) {
            int x = (n*(n+1))/2;
            return x;
}
}
