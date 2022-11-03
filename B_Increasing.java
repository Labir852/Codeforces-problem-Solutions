import java.util.Arrays;
import java.util.Scanner;

public class B_Increasing
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Boolean flag = false;
        for(int i = 1; i <=t; ++i)
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j = 0; j < n; ++j)
            {
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            flag = false;
            for(int j = 1; j < n; ++j)
            {
                if(a[j] > a[j-1])
                continue;
                else
                {
                    flag = true;
                    break;
                }
            }
            if(flag)
            {
                System.out.println("NO");
            }
            else
            System.out.println("YES");
        }    
    }
}