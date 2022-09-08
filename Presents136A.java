import java.util.Scanner;

public class Presents136A{
    static Scanner sc = new Scanner(System.in);
    static void solve(int n, int[] P)
    {
        int i,j;
        for (i = 1; i <= n; i++)
        {
            for (j = 0; j < n; j++)
            {
                if(P[j] == i)
                {
                    System.out.print(j+1+" ");
                    break;
                }
            }
        }
        
        
    }
        public static void main(String[] args) {
        int n = sc.nextInt();
        int[] P = new int[n];
        for (int i = 0; i < n; i++)
        {
            P[i] = sc.nextInt();
        }
        solve(n,P);


    }
}