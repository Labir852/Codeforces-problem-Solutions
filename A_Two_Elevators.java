import java.util.Scanner;
public class A_Two_Elevators{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;++i)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            
            // if(a==1 || (c!=1 && (a-1)<(Math.abs(c-b)+c-1)) ||(c==1 && (a-1) <  (b-c) ))
            // {
            //     System.out.println(1);
            // }
            // else if((c==1 && (a-1)>(b-c))||(c!=1 && (a-1) >  (c-b+c-1) ))
            // {
            //     System.out.println(2);
            // }
            // else if((c!=1 && (a-1) ==  (c-b+c-1) )|| (c==1 && (a-1)==(b-c)) )
            // {
            //     System.out.println(3);
            // }
            if(a-1<Math.abs(c-b)+c-1) 
            {
                System.out.println(1);
            }
            else if(a-1>Math.abs(c-b)+c-1)
            {
                System.out.println(2);
            }
            else
            {
                System.out.println(3);
            }

        }
        
    }
}