package lecture8;

import java.util.Scanner;

class checkPrime { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prime = 1;
       for(int i =2; i<n; i++){
            if(n%i == 0){
            prime=0;
                break;
            }
       }
           if (prime == 1) {
            System.out.println("is prime");
            
           } else{
            System.out.println("not prime");
           }
        }
    }
    