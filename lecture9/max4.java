package lecture9;

import java.util.Scanner;

public class max4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int x = max(a,b,c);
         
        if (x==a) {
            System.out.print(a+ " is greater among");
        } else if (x==b) {
           System.out.print(b+ " is greater among"); 
        } else{
            System.out.print(c+ " is greater among");
        }
}
    public static int max(int a, int b, int c){
        if (a>b && a>c) {
            return a;
        } else if (b>a && b>c) {
            return b;
        } else {
            return c;
        }
    }
}
