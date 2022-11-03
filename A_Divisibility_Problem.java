import java.util.Scanner;

public class A_Divisibility_Problem
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        
        for (int i = 1; i <=t; ++i)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a%b==0)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(b-(a%b));
            }
            
        }
        sc.close();    
    }
}