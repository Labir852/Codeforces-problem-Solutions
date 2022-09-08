import java.util.Scanner;

public class EveryoneLovesToSleep_811A {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t,extra=24*60;
        t = sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            int temp = 50000;
            int n,h,m;
            n = sc.nextInt();
            h = sc.nextInt();
            m = sc.nextInt();
            int minute = h*60+m;
            
            for (int j = 0; j <n;j++)
            {
                //temp = 50000;
                int x,y;
                x= sc.nextInt();
                y = sc.nextInt();
                int alarm = x*60+y;
                
                if(alarm<minute && alarm>60)
                {
                    alarm += extra;
                }
                System.out.println("minute ="+minute);
                System.out.println("alarm ["+j+"] ="+alarm);
                System.out.println("temp ["+j+"] ="+temp);
                if(temp>(alarm - minute))
                {
                    temp = alarm - minute;
                }
                //System.out.println("temp ["+j+"] ="+temp);
            }
        }
        
        
    }


}
