#include<stdio.h>
int main()
{
    int n,i;
    scanf("%d",&n);
    int pi[n],qi[n],res[n],count=0;
    for(i=0;i<n;i++)
    {
        scanf("%d %d",&pi[i],&qi[i]);
        res[i] = qi[i]-pi[i];
        if(res[i]>=2)
        {
            count++;
        }
    }
    printf("%d",count);
    return 0;
}