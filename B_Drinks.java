import java.util.Scanner;

public class B_Drinks
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] P = new int[n];
        int sum = 0;
        for(int i = 0; i <n; ++i)
        {
            P[i] = sc.nextInt();
            sum += P[i];
        }
        double result = (double)sum / (double)n;
        System.out.println(String.format("%.12f", result));
    }
}