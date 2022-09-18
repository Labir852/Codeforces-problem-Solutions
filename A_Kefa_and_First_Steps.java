import java.util.Scanner;

public class A_Kefa_and_First_Steps
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int count =1;
        int temp = 0;
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;++i)
        {
            a[i] = sc.nextInt();
            if(i>=1)
            {
                if(a[i]<a[i-1])
                {
                    if(count>temp)
                        temp = count;
                    count = 1;
                }
                else
                {
                    count++;
                }
            }
        }
        if(temp == 0 || temp<count)
            temp = count;
        System.out.println(temp);
        sc.close();


    }
}