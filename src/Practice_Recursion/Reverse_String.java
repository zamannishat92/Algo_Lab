package Practice_Recursion;

import java.util.Scanner;

public class Reverse_String {
   public static void reverse(String s){
        if(s == null || s.length()<1){
            System.out.print(s);
        }
        System.out.print(s.charAt(s.length()-1));
        reverse(s.substring(0,s.length()-1));

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        reverse(s);

    }
}
