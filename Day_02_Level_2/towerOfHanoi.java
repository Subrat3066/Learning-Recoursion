public class towerOfHanoi{
    public static void solve(int n , String src , String help , String d)
    {
        if(n == 1)
        {
            System.out.println("Transfer disk "+ n + " from " + src + " to " + d);
            return;
        }
        solve(n-1 , src ,d,help);
        System.out.println("Transfer disk "+ n + " from " + src + " to " + d);
        solve(n-1 , help , src , d);
    }
    
    public static void main(String[] args) {
        solve(3 , "S" , "H" , "D");
    }
}