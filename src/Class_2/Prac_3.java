package Class_2;

import java.util.Scanner;

public class Prac_3 {
    public static void rec(int n){
        if(n==1){
            System.out.println(n);
        }
        else{
            if(n%2!=0){
                rec(n-2);
                System.out.println(n);
            }
            else{
                int m=n-1;
                rec(m-2);
                System.out.println(m);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        rec(n);

    }
}
