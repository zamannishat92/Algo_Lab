package Class_1.Recursion;
import java.util.Scanner;
public class Prime_Number {
    public static int prime(int y,int i)
    {
        if(i < y)
        {
            if(y % i != 0)
            {
                return(prime(y, ++i));
            }
            else
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args)
    {
        int n, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        x = prime(n, 2);
        if(x == 1)
        {
            System.out.println(n+" is prime number");
        }
        else
        {
            System.out.println(n+" is not prime number");
        }
    }

}
