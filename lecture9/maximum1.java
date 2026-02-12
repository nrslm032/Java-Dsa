package lecture9;

import java.util.Scanner;

public class maximum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        max(a,b);
    }
    public static void max (int a, int b) {
        if (a>b) {
            System.out.print(a+ " is greater");
        } else {
            System.out.print(b+ " is greater");
        }
    }
}
