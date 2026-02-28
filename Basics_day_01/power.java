//28-02-2026

import java.util.*;

public class power{
    public static int calcPower(int x , int n)
    {
        if(n == 1)return x;

        return x * calcPower(x , n-1);
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
        System.out.print("X to the power n is : "+calcPower(x , n));
    }
}