package lecture2;

import java.util.Scanner;

public class grade1 {
    public static void main(String[] args) {
    
        int mark = 97;
        if(mark >= 90 && mark <=100){
            System.out.println("A+");
        }else if (mark >= 75 && mark < 90) {
                System.out.println("A");
        
        }else if (mark >= 60 && mark < 75) {
                System.out.println("B");
        
        }else if (mark >= 40 && mark < 60) {
                System.out.println("C");
        
        }else{
                System.out.println("Fail");
        
        }




    }

}
