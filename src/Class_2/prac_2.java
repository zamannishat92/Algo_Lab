package Class_2;

import java.util.Scanner;

public class prac_2 {
    static void rec(int n){
        if(n==1){
            System.out.println(n);
        }
        else {
            rec(n-2);
            if(n%2!=0) {
                System.out.println(n);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number-");
        int n = sc.nextInt();
        rec(n);

    }
}
