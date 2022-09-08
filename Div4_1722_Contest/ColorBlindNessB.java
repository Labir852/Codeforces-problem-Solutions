

import java.util.Scanner;

public class ColorBlindNessB {
    static Scanner sc = new Scanner(System.in);
    static boolean solve(int n, String[] color)
    {
        boolean flag = false;
        for (int i = 0; i < 2; ++i)
        {
            color[i] = color[i].replace("G","B");
        }
        if(color[0].equals(color[1]))
        {
            flag = true;
        }
        
        
        return flag;
    }
    public static void main(String[] args) 
    {
        int T = sc.nextInt();
        for (int i = 1;i<=T;++i)
        {
            int n = sc.nextInt();
            String[] color = new String[2];
            for (int j = 0;j<2;++j)
            {
                 color[j] = sc.next();
            }
            if(solve(n,color))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
