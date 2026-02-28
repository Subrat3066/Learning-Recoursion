//DATE : 28-02-2026


import java.util.*;

public class fibonacci{
    public static void fibo(int n , int a , int b , int c)
    {
        if(n == 2)return ;
        c = a +b;
        System.out.print(c+" ");
        fibo(n -1 , b , c , c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0 || n == 1)
        {
            System.out.print(0);
            return;
        }
        if(n == 2)
        {
            System.out.print(0+" "+1);
            return;
        }
        System.out.print(0+" "+1+" ");
        fibo(n , 0 , 1 , 0);
    }  
}