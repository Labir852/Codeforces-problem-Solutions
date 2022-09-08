import java.util.Scanner;

public class SpellCheckA {
    static Scanner sc = new Scanner(System.in);
    static int count=0;
    static boolean solve(int n, String s){
        boolean flag=true;
        boolean br = false;
        count=0;
        if(n!=5)
        {
            flag=false;
            return flag;
        }
        else
        {
            for(int i=0; i<n; ++i){
                if(s.charAt(i)=='T' || s.charAt(i)=='i' ||s.charAt(i)=='m' || s.charAt(i)=='u' || s.charAt(i)=='r')
                {
                    for(int j=0;j<i;++j)
                    {
                        if(s.charAt(i)==s.charAt(j))
                        {
                            br = true;
                            break;
                        }
                    }
                    if(br)
                    {
                        count = 0; 
                        break;
                    }
                    else{ 
                        ++count;
                    }
                }
            }
            if(count !=5)
            {
                flag = false;
            }
            return flag;
        }
        
    }
    public static void main(String[] args) {
        int T = sc.nextInt();
        for (int i = 0; i <T; ++i)
        {
            int n = sc.nextInt();
            String s = sc.next();
            if(solve(n, s))
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
