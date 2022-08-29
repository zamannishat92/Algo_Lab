package Class_2;

import java.util.Scanner;


public class Prac_5 {
    public static int rec(String n){
        String[] s=new String[n.length()];
        if(n.equals("")){
            return 0;
        }
        else {
            return rec(n.substring(1))+1;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        //int i=0;
        System.out.println(rec(n));

    }
}
