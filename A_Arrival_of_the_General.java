import java.util.Scanner;

public class A_Arrival_of_the_General
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i <n;i++)
        {
            a[i] = sc.nextInt();
        }
        int max=a[0],min=a[0],posMin=0,posMax=0;
        for(int i = 1; i < n; i++)
        {
            if(a[i] <= min)
            {
                min = a[i];
                posMin = i;
            }
            if(a[i] > max)
            {
                max = a[i];
                posMax = i;
            }
        }
        if(max == a[0])
        posMax = 0;

        //System.out.println(posMax + "   "+ posMin + "  ");
        int seconds = (Math.abs(posMax-0) + Math.abs(posMin-(n-1)));
        if(posMax > posMin)
        --seconds;
        System.out.println(seconds); 
        
        
    }
}