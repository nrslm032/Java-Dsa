package lecture9;

import java.util.Scanner;

public class allEven2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i <= n;i++){
            int x = show(i);
            if( x == i){
                System.out.print(x + " ");
            }
        }

        
    }

    public static int show(int i){
        if(i% 2 == 0){
            return i;
        } else {
            return 0; 
        }
    }
}