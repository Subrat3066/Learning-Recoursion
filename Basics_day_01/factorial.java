public class factorial{
    public static int calcFact(int n)
    {
        if(n == 1 || n == 0)return 1;

        return n*calcFact(n-1);
    }
    public static void main(String[] args) {
        System.out.print(calcFact(5));
    }
}