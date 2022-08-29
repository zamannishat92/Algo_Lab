package Class_3;

import java.util.Scanner;

public class Problem_5 {
    public static int func(int n){
        if(n<=5){
            return 1;
        }else if(n%2 !=0){
            return func(n/2)+func(n/3);
        }else{
            return func(n/3)+func(n/4);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number--");
        int n=sc.nextInt();
        int m=func(n);
        System.out.println(m);
    }
}
