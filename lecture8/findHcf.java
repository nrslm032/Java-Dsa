package lecture8;

import java.util.Scanner;

public class findHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int m = sc.nextInt();
        // int n = sc.nextInt();
            int m = 75;
            int n = 50;

            while (m%n != 0) {
                int r = m%n;
                m=n;
                n=r;

            }
            System.out.print(n+ " ");
        }
    }
