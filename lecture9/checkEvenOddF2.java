package lecture9;

import java.util.Scanner;

public class checkEvenOddF2 {

    public static int check(int a){
        if (a%2==0) {
            return 1;
        }
            else {
                return 0;
            }
        }

        
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int x = check(a);
        if(x==1){
            System.out.print("even");
        }
        else{
            System.out.print("Odd");
        }

       
     }
}
    

