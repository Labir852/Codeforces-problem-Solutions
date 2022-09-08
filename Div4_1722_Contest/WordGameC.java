package Div4_1722_Contest;

import java.util.Scanner;

public class WordGameC {
    static Scanner sc = new Scanner(System.in);
    static void solve(int n1,int n,String[][] str)
    {
        String temp;
        int [] scores = new int[]{0,0,0};
        for (int j=0;j<n1;j++)
            {
                for(int p=0;p<n;p++)
                {
                    temp = str[j][p];
                    if(j==0)
                    {
                        for(int i=1;i<n1;i++)
                        {
                            for(int q=0;q<n;q++)
                            {
                                if(temp.equals(str[i][q]))
                                {
                                    scores[j]++;
                                }
                            }
                        }
                    }
                }
            }
    }
    public static void main(String[] args) 
    {
        int T = sc.nextInt();
        for (int i = 1 ; i <= T ; ++i)
        {
            int n = sc.nextInt();
            int n1 = 3;
            String[] str1 = new String[n];
            String[] str2 = new String[n];
            String[] str3 = new String[n];
            for (int p=0;p<n;p++)
                str1[p] = sc.next();
            for (int p=0;p<n;p++)
                str2[p] = sc.next();
            for (int p=0;p<n;p++)
                str3[p] = sc.next();
            
                
            solve(n1,n,str); 
        }    
    }
}
