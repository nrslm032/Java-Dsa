package lecture9;

import java.util.Scanner;

public class checkEvenOddF1 {

    public static void check(int a) {

        if(a%2==0){
            System.out.print(a+ " is even");
        }else{
            System.out.print(a+ " is Odd");
        }
        
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        check(a);
     }
}
