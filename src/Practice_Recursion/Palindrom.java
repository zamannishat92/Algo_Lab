package Practice_Recursion;

import java.util.Scanner;

public class Palindrom {
    public static boolean pal(String n){
        if(n.length()==1){
            return true;
        }else if(n.charAt(0)==n.charAt(n.length()-1)){
            return pal(n.substring(1,n.length()-1));
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word.");
        String n=sc.next();
        if( pal(n)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
