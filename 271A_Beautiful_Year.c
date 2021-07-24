#include<stdio.h>
int main()
{
    int year,i=0,n,output,remaider[4],p,j;
    scanf("%d",&year);
    p = year;
    n = year;
    while(n!=0)
    {
        remaider[i] = n % 10;
        n/=10;
        i++;
    }
    for ( i = 0; i < 4; i++)
    {
        for(j=i;j<n;j++)
        
    }
    
    return 0;
}