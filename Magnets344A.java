import java.util.Scanner;
public class Magnets344A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0;i<n;++i)
		{
		    arr[i] = sc.next();
		}
		for(int i=0;i<n-1;i++)
		{
		    if(arr[i].charAt(1) == arr[i+1].charAt(0))
		    {
		        ++count;
		    }
		    else
		    {
		        continue;
		    }
		}
		System.out.println(count);
	}
}
