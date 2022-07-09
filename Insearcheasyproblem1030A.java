import java.util.Scanner;

public class Insearcheasyproblem1030A
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int flag = 0;
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] == 1)
            flag = 1;
        }
        if(flag == 0)
        {
            System.out.print("EASY");
        }
        else
        {
            System.out.println("HARD");
        }

    }
}