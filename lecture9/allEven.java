package lecture9;

import java.util.Scanner;

public class allEven {
    public static void show(int n) {
        for(int a=0; a <= n; a++){
        if(a%2==0){
            System.out.print(a);
        }else{
            System.out.print(" ");
        }
    }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
       show(n);
     }

}