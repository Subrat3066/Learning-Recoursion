import java.util.*;
public class permutation{
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permute(nums);
    }
    static void permute(int[] nums)
    {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            ArrayList<Integer>l = new ArrayList<>();
            l.add(nums[i]);
            for(int j = i+1 ;j < nums.length ;j++)
            {
                for(int k = i+1 ; k < nums.length ; k++)
                {
                    l.add(nums[k]);
                }
                list.add(l);
                print(l);
            }
        }
    
    }
    static void print(ArrayList<Integer>list)
    {
        for(int i = 0 ; i < list.size() ; i++)
        {
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}