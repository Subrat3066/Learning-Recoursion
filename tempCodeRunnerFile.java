public class Questions{
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(sum(10));

        int n = 7;
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
        fibo(0 , 1 , 1 , n);

        System.out.print(rev("LeetCode" , 8 , 0));
    }
    public static int fact(int n)
    {
        if(n == 0 || n == 1)return 1;
        return n * fact(n-1);
    }

    public static int sum(int n)
    {
        if(n == 1)return 1;
        return n + sum(n-1);
    }

    public static void fibo(int a , int b , int c ,int n)
    {
        if(n == 2){System.out.println(); return ;}
        c = a +b;
        System.out.print(c+" ");
        fibo( b , c , c , n-1);
    }

    public static String rev(String s , int len , int t )
    {
        if(t == len)
        {
            return "";
        }
        return rev(s , len , t+1)+s.charAt(t);
    }
}