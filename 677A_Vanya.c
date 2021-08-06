#include<stdio.h>
int main()
{
    int n, h,i,sum=0;
    scanf("%d %d",&n, &h);
    int a[n];
    for(i=0;i<n;i++)
    {
        scanf("%d", &a[i]);
        
    }
    for (i = 0; i < n; i++)
    {
        if(h<a[i])
            sum+=2;
        else
            sum+=1;
    }
    printf("%d",sum);
    



    return 0;
}