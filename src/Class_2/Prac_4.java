package Class_2;

import java.util.Scanner;
//Ascending order
public class Prac_4 {
    public static void f(int n){
        if(n==1){
            System.out.println("1");
        }else {
            System.out.println(n);
            f(n - 1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(n);
        //System.out.println(rec(n));
    }
}
