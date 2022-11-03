import java.util.Scanner;

public class C_Stripes
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=1;i<=t;++i)
        {
            String[][] a = new String[8][8];
            for(int j=0;j<8;++j)
            {
                for(int k=0;k<8;++k)
                {
                    a[j][k] = sc.next();
                }
            }
        }
        sc.close();    
    }
}