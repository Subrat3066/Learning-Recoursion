//28-02-2026

import java.util.*;

// Height of stact is O(n)
public class power{
    public static int calcPower(int x , int n)
    {
        if(n == 1)return x;

        return x * calcPower(x , n-1);
    }

// Height of stact is O(log n)

    public static int calcPowerOptimized(int x , int n)
    {
        if(n == 1)return x;

        if(n % 2 == 0)
        {
            return calcPowerOptimized(x , n/2) * calcPowerOptimized(x , n/2);
        }
        else
        {
            return x * calcPowerOptimized(x , n/2) * calcPowerOptimized(x , n/2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        if(n == 0)
        {
            System.out.print("X to the power n is : "+1);
            return;
        }
        System.out.print("X to the power n is : "+calcPowerOptimized(x, n));
    }
}