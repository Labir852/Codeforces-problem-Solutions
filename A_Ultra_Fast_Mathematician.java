import java.util.Scanner;

public class A_Ultra_Fast_Mathematician
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int[] res = new int[a.length()];
        for(int i=0;i<a.length();i++)
        {
            int val1 = (int)a.charAt(i);
            int val2 = (int)b.charAt(i);
            if(val1 == val2)
            {
                res[i] = 0;
            }
            else
            {
                res[i] = 1;
            }
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]);
        }
    }
}