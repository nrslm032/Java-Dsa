package lecture9;

import java.util.Scanner;

public class max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        max(a,b,c);

    }
    public static void max(int a, int b,int c){
        if (a>b && a>c) {
            System.out.print(a+ " is Greater among");
        } else if (b>a && b>c) {
            System.out.print(b+ "is Greater among");
        } else{
            System.out.print(c+ "is Greater among");
            
        }
    }
        
}
