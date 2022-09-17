import java.util.Scanner;

public class A_I_Wanna_Be_the_Guy
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int count =0;
        Boolean flag = false;
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] a = new int[p];
        for(int i=0;i<p;i++)
        {
            a[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] b = new int[q];
        for(int i=0;i<q;i++)
        {
            b[i] = sc.nextInt();
        }
        for(int i=1;i<=n;i++)
        {
            flag=false;
            for(int j=0;j<p;j++)
            if(a[j] == i)
            {
                count++;
                flag = true;
                break;
            }
            if(flag)
            {
                continue;
            }
            for(int j=0;j<q;j++)
            if(b[j] == i)
            {
                count++;
            }
        }
        if(count == n)
        {
            System.out.println("I become the guy.");
        }
        else
        {
            System.out.println("Oh, my keyboard!");
        }

        sc.close();    
    }
}