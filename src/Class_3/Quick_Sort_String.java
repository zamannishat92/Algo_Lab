package Class_3;

import java.util.Scanner;

public class Quick_Sort_String {
        public static int divide(String[] array,int start,int end){
            if(start<end){
                int value=sort(array,start,end);
                divide(array,start,value-1);
                divide(array,value+1,end);
            }
            return 0;
        }
        public static int sort(String[] array,int start,int end){
            String pivot=array[end];
            int i=start-1;
            for (int j = start; j < end; j++) {
                if(array[j].compareTo(pivot)<0){
                    i++;
                    String temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            String temp=array[i+1];
            array[i+1]=array[end];
            array[end]=temp;

            return i+1;
        }
        public static void print(String[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of array");
            int n=sc.nextInt();
            System.out.println("Enter the elements of array");
            String[] array=new String[n];
            for (int i = 0; i < n; i++) {
                array[i]=sc.next();
            }
            divide(array,0,n-1);
            print(array);
            System.out.println(" ");
        }
    }


