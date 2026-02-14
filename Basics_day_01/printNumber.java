public class printNumber{
    public static void main(String[] args)
    {
        System.out.print("Hello");
        print(10);
    }
    public static void print(int n)
    {
        if(n == 0)
        {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }
}