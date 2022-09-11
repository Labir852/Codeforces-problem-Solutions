import java.util.Scanner;

public class A_Even_Odds
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long result = 0;
            if(k <= n/2 || (k <= n/2+1 && n%2 != 0))
            {
                result = (k*2)-1; 
            }
            else
            {
                if(n%2==0 && (k%2!=0|| k%2==0))
                {
                    result = (k-(n/2))*2;
                }
                else
                {
                    result = (k-(n/2)-1)*2;
                }
            } 
        System.out.println(result);
    }
}