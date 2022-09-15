import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_Is_your_horseshoe_on_the_other_hoof
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int count = 4;
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<4;i++)
        {
            set.add(sc.nextInt());
            
        }
        count -= set.size();
        System.out.println(set);
        System.out.println(count);
        sc.close();
    }
 }