import java.util.Scanner;
public class B_Taxi
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] freq = new int[4];
		for(int i = 0; i < n; i++)
        {
            freq[sc.nextInt()-1]++;
        }
        int taxi = freq[3];
        int matches = Math.min(freq[2],freq[0]);
        taxi += matches;
        freq[2] -= matches;
        freq[0] -= matches;
        taxi += freq[2];
        int matches2 = freq[1]/2;
		taxi+=matches2;
		freq[1]-=matches2*2;
        if(freq[1]!=0)
		{
			taxi++;
			freq[0]-=Math.min(2,freq[0]);
		}
        taxi+=freq[0]/4;
		if(freq[0]%4!=0)
			taxi++;
		
		System.out.printf("%d\n",taxi);
			
        
        sc.close();    
    }
   
}