package Class_1.Recursion;

import java.util.Scanner;

public class Reverse_Number {
    public static void reverse(int x){
        if(x<10){
            System.out.println(x);
        }
        else{
            System.out.print(x%10);
            reverse(x/10);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number-");
        int x = sc.nextInt();
        reverse(x);

    }
}
