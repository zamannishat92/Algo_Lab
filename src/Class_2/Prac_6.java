package Class_2;

import java.util.Scanner;


public class Prac_6 {
    public static int rec(int[] a,int flag,int l,int h,int key){

        if(l>h){return 0;
        }
        else{
            int mid=(l+h)/2;

            if(key!=a[mid]){
                if(key>a[mid]){
                    return rec(a,flag++,mid+1,h,key);
                    //System.out.println("found");


                }else {
                   return rec(a,flag++,l,mid-1,key);
                    //System.out.println(" found");
                   // return flag++;

                }
            }else{
                //System.out.println(" Found");
                return 1;

            }
        }
        //return 0;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a= new int[50];
        System.out.println("Enter the array size--");
        int n=sc.nextInt();
        System.out.println("Enter the key--");
        int key=sc.nextInt();
        int l=0,flag=0;
        int h=n-1;
        System.out.println("Enter the array--");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=rec(a,flag,l,h,key);
        if(m>0){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
